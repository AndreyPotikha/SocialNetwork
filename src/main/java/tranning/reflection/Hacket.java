package tranning.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Hacket {

    public static void main(String[] args) {

        Victim victim = new Victim();

        Class<? extends Victim> clazz = victim.getClass();

        Method[] methods = clazz.getDeclaredMethods();
        Field[] declaredFields = clazz.getDeclaredFields();
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();

        List<String> listAll = new ArrayList<>();

        for (Method method : methods) {
            listAll.add("Method - " + method.getName());
        }
        for (Field declaredField : declaredFields) {
            listAll.add("Field - " + declaredField.getName());
        }
        for (Annotation declaredAnnotation : declaredAnnotations) {
            listAll.add("Annotation - " + declaredAnnotation.annotationType().getSimpleName());
        }
    }

}
