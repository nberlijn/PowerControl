package nl.nberlijn.powercontrol.kernel.seeder;

import nl.nberlijn.powercontrol.kernel.config.ClassPaths;
import nl.nberlijn.powercontrol.kernel.config.Symbols;
import nl.nberlijn.powercontrol.kernel.parsers.JAXBParser;

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
