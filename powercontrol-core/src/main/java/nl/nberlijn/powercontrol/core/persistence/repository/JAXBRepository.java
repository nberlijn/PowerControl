package nl.nberlijn.powercontrol.core.persistence.repository;

import nl.nberlijn.powercontrol.api.persistence.repository.Repository;
import nl.nberlijn.powercontrol.core.config.Extensions;
import nl.nberlijn.powercontrol.core.persistence.parsers.JAXBParser;

import java.io.File;

public abstract class JAXBRepository<T> implements Repository<T> {

    private final JAXBParser jaxbParser;
    private T object;

    @SuppressWarnings("unchecked")
    public JAXBRepository(Class className) {
        File file = new File(System.getProperty("user.dir") + "/storage/" + className.getSimpleName().toLowerCase() + Extensions.XML);

        jaxbParser = new JAXBParser(file, className);
        object = (T) jaxbParser.unmarshaller();
    }

    @Override
    public T get() {
        return object;
    }

    @Override
    public void update(T object) {
        this.object = object;
    }

    @Override
    public void store() {
        jaxbParser.marshaller(object);
    }

}
