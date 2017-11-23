package tranning.annotation.two;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Default {

    String name() default "Andray";

    String surname() default "Potikha";

}
