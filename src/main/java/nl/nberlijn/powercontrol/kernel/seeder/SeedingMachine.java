package nl.nberlijn.powercontrol.kernel.seeder;

import java.io.File;

public class SeedingMachine {

    public SeedingMachine() {
        try {
            checkFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkFiles() throws Exception {
        /*

        TODO: Read all the class names (and their location) from the seeds package into an array
        TODO: Convert all the class names into a (local) files array new File (System.getProperty("user.dir") + "/storage/device.xml)

        TODO: Give the Kernel his own config directory and his own config files

        seeder.seed() will seed the seed

        seeder.seed(DeviceSeed);
        seeder.seed(CommandsSeed);

        */

        File[] files = {
                new File(System.getProperty("user.dir") + "/storage/device.xml"),
                new File(System.getProperty("user.dir") + "/storage/commands.xml")
        };

        for (File file : files) {
            if (!file.exists()) {
                new Seeding(generateSeedName(file));
            }
        }
    }

    private String generateSeedName(File file) {
        String name = file.getName().replace(".xml", "");
        name = Character.toUpperCase(name.charAt(0)) + name.substring(1);

        return name;
    }

}
