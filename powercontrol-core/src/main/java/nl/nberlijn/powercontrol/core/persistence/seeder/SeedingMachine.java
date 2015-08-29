package nl.nberlijn.powercontrol.core.persistence.seeder;

import nl.nberlijn.powercontrol.api.persistence.seeder.Machine;
import nl.nberlijn.powercontrol.api.persistence.seeder.Seed;
import nl.nberlijn.powercontrol.api.persistence.seeder.Seeder;
import nl.nberlijn.powercontrol.utils.XML;

import org.reflections.Reflections;

import java.io.File;
import java.util.Set;

public class SeedingMachine implements Machine {

    private String seedsPackage;
    private String modelsPackage;
    private String outputDirectory;

    public SeedingMachine(String seedsPackage, String modelsPackage, String outputDirectory) {
        this.seedsPackage = seedsPackage;
        this.modelsPackage = modelsPackage;
        this.outputDirectory = outputDirectory;
    }

    @Override
    public void start() {
        Reflections reflections = new Reflections(seedsPackage);
        Set<Class<?>> seeds = reflections.getTypesAnnotatedWith(Seed.class);

        seeds.forEach(this::check);
    }

    private Boolean check(Class<?> seed) {
        File file = XML.generateOutputFile(outputDirectory, seed.getAnnotation(Seed.class).location(), seed, "Seed");

        if (!file.exists()) {
            return compose(seed, file);
        }

        return true;
    }

    private Boolean compose(Class<?> seed, File file) {
        try {
            Seeder seeder = (Seeder) seed.newInstance();
            Seeding seeding = new Seeding(modelsPackage, seeder, file);

            Thread thread = new Thread(seeding);
            thread.start();
        } catch (InstantiationException | IllegalAccessException e) {
            return false;
        }

        return true;
    }

}
