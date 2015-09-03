package nl.nberlijn.powercontrol.utils;

import java.io.File;

public final class XML {

    public static File generateOutputFile(String outputDirectory, String location, Class className, String remove) {
        String directory = outputDirectory + "/" + location.replace(".", "/");
        String name = className.getSimpleName();

        if (!remove.isEmpty()) {
            name = name.replace(remove, "");
        }

        String fileName = name.toLowerCase() + Extensions.XML;

        return new File(directory + "/" + fileName);
    }

    public static File generateOutputFile(String outputDirectory, String location, Class className) {
        return generateOutputFile(outputDirectory, location, className, null);
    }

}
