package nl.nberlijn.powercontrol.api.persistence.seeder;

@SuppressWarnings("unused")
public interface Seeder<T> {

    T seed();

}
