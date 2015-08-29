package nl.nberlijn.powercontrol.api.persistence.seeder.enums;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SuppressWarnings("unused")
public @interface Seed {

    String directory() default "default";

}
