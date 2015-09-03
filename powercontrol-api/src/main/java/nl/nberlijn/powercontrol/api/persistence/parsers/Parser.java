package nl.nberlijn.powercontrol.api.persistence.parsers;

public interface Parser<T> {

    void generate(T object);

    T parse();

}
