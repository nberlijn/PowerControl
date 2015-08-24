package nl.nberlijn.powercontrol.kernel.parsers;

import javax.xml.bind.*;
import java.io.*;

public final class JAXBParser {

    private File file;
    private JAXBContext jaxbContext;

    public JAXBParser(File file, Class className) {
        try {
            this.file = file;
            this.jaxbContext = JAXBContext.newInstance(className);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void marshaller(Object object) {
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Object unmarshaller() {
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            return unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            return null;
        }
    }

}
