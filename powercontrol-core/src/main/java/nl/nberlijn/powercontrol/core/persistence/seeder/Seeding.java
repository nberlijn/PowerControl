package nl.nberlijn.powercontrol.core.persistence.seeder;

import nl.nberlijn.powercontrol.api.persistence.seeder.Seeder;
import nl.nberlijn.powercontrol.core.persistence.parsers.XMLParser;

import java.io.File;
import java.lang.reflect.Method;

class Seeding implements Runnable {

    private final String modelsPackage;
    private final Seeder seeder;
    private final File file;

    public Seeding(String modelsPackage, Seeder seeder, File file) {
        this.modelsPackage = modelsPackage;
        this.seeder = seeder;
        this.file = file;
    }

    @Override
    public void run() {
        try {
            File directory = new File(file.getParent());

            if (!directory.exists()) {
                if (!directory.mkdirs()) {

                }
            }

            // TODO: Optimize this part with utils.
            String name = seeder.getClass().getSimpleName().replace("Seed", "");
            Class<?> className = Class.forName(modelsPackage + "." + name);
            Method method = seeder.getClass().getMethod("start");
            Object object = method.invoke(seeder);

            XMLParser XMLParser = new XMLParser(file, className);
            XMLParser.generate(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
