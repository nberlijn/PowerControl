package nl.nberlijn.powercontrol.kernel.model;

import nl.nberlijn.powercontrol.config.Storage;
import nl.nberlijn.powercontrol.kernel.parsers.JAXBParser;

import java.io.File;

@SuppressWarnings("unchecked")
public abstract class Model<T> {

    private final JAXBParser jaxbParser;
    private T object;

    protected Model(Class className) {
        File file = new File(Storage.LOCAL_STORAGE_DIR + className.getSimpleName().toLowerCase() + Storage.STORAGE_EXTENSION);

        jaxbParser = new JAXBParser(file, className);
        object = (T) jaxbParser.unmarshaller();
    }

    public void store() {
        jaxbParser.marshaller(object);
    }

    protected T getObject() {
        return object;
    }

    protected void setObject(T object) {
        this.object = object;
    }

}
