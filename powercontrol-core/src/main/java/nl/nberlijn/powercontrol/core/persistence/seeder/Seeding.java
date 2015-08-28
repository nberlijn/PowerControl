package nl.nberlijn.powercontrol.core.persistence.seeder;

import nl.nberlijn.powercontrol.api.persistence.seeder.Seeder;
import nl.nberlijn.powercontrol.core.config.ClassPaths;
import nl.nberlijn.powercontrol.core.config.Symbols;
import nl.nberlijn.powercontrol.core.persistence.parsers.JAXBParser;

import java.io.File;

class Seeding implements Runnable {

    private final Seeder seed;
    private final File file;

    public Seeding(Seeder seed, File file) {
        this.seed = seed;
        this.file = file;
    }

    @Override
    public void run() {
        try {
            File directory = new File(file.getParent());

            if (!directory.exists()) {
                if (!directory.mkdirs()) {
                    throw new Exception();
                }
            }

            new JAXBParser(file, Class.forName(ClassPaths.OBJECTS + Symbols.DOT + seed.getClass().getSimpleName().replace("Seed", ""))).marshaller(seed.getClass().getMethod("seed").invoke(seed));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
