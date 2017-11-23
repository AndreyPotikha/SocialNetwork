package tranning.annotation.two;

import java.lang.reflect.Method;

public class BarService {

    public static void main(String[] args) throws NoSuchMethodException {

        Miracle miracle = new Miracle();
        Class<? extends Miracle> clazz = miracle.getClass();

        Method method = clazz.getDeclaredMethod("print");
        boolean present = method.isAnnotationPresent(CoddingTime.class);
        System.out.println(present);

        Class<? extends Miracle> aClazz = miracle.getClass();
        aClazz.getDeclaredMethod("print");
        boolean present2 = method.isAnnotationPresent(Reference.class);
        System.out.println(present2);

        Class<? extends Miracle> eClazz = miracle.getClass();
        Method present3 = eClazz.getDeclaredMethod("print");
        Default declaredAnnotation = present3.getDeclaredAnnotation(Default.class);
//        System.out.println(declaredAnnotation);
        System.out.println(declaredAnnotation.name());
        System.out.println(declaredAnnotation.surname());

    }
}
