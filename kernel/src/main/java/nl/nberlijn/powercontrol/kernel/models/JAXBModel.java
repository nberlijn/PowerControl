package nl.nberlijn.powercontrol.kernel.models;

import nl.nberlijn.powercontrol.kernel.config.Extensions;
import nl.nberlijn.powercontrol.kernel.config.Local;
import nl.nberlijn.powercontrol.kernel.parsers.JAXBParser;

import java.io.File;

@SuppressWarnings("unchecked")
public abstract class JAXBModel<T> {

    private final JAXBParser jaxbParser;
    private T object;

    protected JAXBModel(Class className) {
        File file = new File(Local.LOCAL_STORAGE_DIR_PATH + className.getSimpleName().toLowerCase() + Extensions.XML);

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
