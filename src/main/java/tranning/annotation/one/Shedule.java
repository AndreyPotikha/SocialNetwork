package tranning.annotation.one;

public @interface Shedule {

    String reason();

    String when();

    String where() default "hare";
}
