package nl.nberlijn.powercontrol.core.persistence.repository;

import nl.nberlijn.powercontrol.api.persistence.repository.Repository;
import nl.nberlijn.powercontrol.core.config.Local;
import nl.nberlijn.powercontrol.core.persistence.parsers.XMLParser;
import nl.nberlijn.powercontrol.utils.XML;

import java.io.File;

public abstract class XMLRepository<T> implements Repository<T> {

    private final XMLParser<T> xmlParser;
    private T object;

    public XMLRepository(String location, Class className) {
        File file = XML.generateOutputFile(Local.LOCAL_DIR, location, className);

        xmlParser = new XMLParser<>(file, className);
        object = xmlParser.parse();
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
        xmlParser.generate(object);
    }

}
