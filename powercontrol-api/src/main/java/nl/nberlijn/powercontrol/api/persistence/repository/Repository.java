package nl.nberlijn.powercontrol.api.persistence.repository;

public interface Repository<T> {

    T get();

    void update(T object);

    void store();

}
