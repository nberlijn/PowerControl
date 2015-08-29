package nl.nberlijn.powercontrol.core.persistence.parsers;

import nl.nberlijn.powercontrol.api.persistence.parsers.Parser;

import javax.xml.bind.*;
import java.io.*;

public final class XMLParser<T> implements Parser<T> {

    private File file;
    private JAXBContext jaxbContext;

    public XMLParser(File file, Class className) {
        try {
            this.file = file;

            jaxbContext = JAXBContext.newInstance(className);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generate(T object) {
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public T parse() {
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            return (T) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            return null;
        }
    }

}
