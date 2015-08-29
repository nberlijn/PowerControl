package nl.nberlijn.powercontrol.core.persistence.seeder;

import nl.nberlijn.powercontrol.api.persistence.seeder.enums.Seed;
import nl.nberlijn.powercontrol.api.persistence.seeder.Seeder;
import nl.nberlijn.powercontrol.core.config.Symbols;
import nl.nberlijn.powercontrol.core.config.Extensions;

import org.reflections.Reflections;

import java.io.File;
import java.util.Set;

public class SeedingMachine {

    public void seed(String packageName, String directoryName) {
        Reflections reflections = new Reflections(packageName);
        Set<Class<?>> seeds = reflections.getTypesAnnotatedWith(Seed.class);

        for (Class<?> seed : seeds) {
            File file = seedFile(directoryName, seed);

            if (!file.exists()) {
                try {
                    Seeder seeder = (Seeder) seed.newInstance();
                    seeding(seeder, file);
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private File seedFile(String directory, Class<?> seed) {
        String seedDirectory = directory + Symbols.SEPARATOR;
        String seedLocation = seed.getAnnotation(Seed.class).directory();

        if (!seedLocation.equals("default")) {
            seedDirectory += seedLocation.replace(Symbols.DOT, Symbols.SEPARATOR) + Symbols.SEPARATOR;
        }

        String seedFileName = seed.getSimpleName().replace("Seed", "").toLowerCase() + Extensions.XML;
        String seedFilePath = seedDirectory + seedFileName;

        return new File(seedFilePath);
    }

    private void seeding(Seeder seeder, File file) {
        Seeding seeding = new Seeding(seeder, file);
        Thread thread = new Thread(seeding);
        thread.start();
    }

}
