package nl.nberlijn.powercontrol.kernel.seeder;

import nl.nberlijn.powercontrol.kernel.parsers.JAXBParser;

import java.io.File;
import java.lang.reflect.Method;

/*

TODO: Most of the methods will be moved to the SeedingMachine class

 */
public class Seeding {

    private String seedName;
    private Seeder seeder;

    public Seeding(String seedName) throws Exception {
        this.seedName = seedName;
        this.seeder = seedClass();

        File file = new File(seedOutputDirectory() + seedOutputFileName());
        Object seedMethod = seedMethod().invoke(seeder);

        seed(file, seedMethod);
    }

    private Seeder seedClass() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String seedClassName = "nl.nberlijn.powercontrol.seeds." + seedName + "Seed";

        return (Seeder) Class.forName(seedClassName).newInstance();
    }

    private Seed seedAnnotation() {
        return seeder.getClass().getAnnotation(Seed.class);
    }

    private Method seedMethod() throws NoSuchMethodException {
        return seeder.getClass().getMethod("seed");
    }

    private String seedOutputDirectory() {
        return System.getProperty("user.dir") + "/" + seedAnnotation().location().replace(".", "/") + "/";
    }

    private String seedOutputFileName() {
        return seedName.toLowerCase() + ".xml";
    }

    private void seed(File file, Object seedMethod) throws Exception {
        checkDir(new File(file.getParent()));

        Class objectClass = Class.forName("nl.nberlijn.powercontrol.objects." + seedName);

        new JAXBParser(file, objectClass)
                .marshaller(seedMethod);
    }

    private void checkDir(File directory) throws Exception {
        if (!directory.exists()) {
            if (!directory.mkdirs()) {
                throw new Exception();
            }
        }

    }

}
