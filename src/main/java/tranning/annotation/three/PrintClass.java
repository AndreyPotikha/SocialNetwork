package tranning.annotation.three;

import java.lang.reflect.Method;

public class PrintClass {

    public static void main(String[] args) throws NoSuchMethodException {

        PrintClass printClass = new PrintClass();
        Class<? extends PrintClass> clazz = printClass.getClass();
        Method print = clazz.getDeclaredMethod("print");
        if (print.isAnnotationPresent(AllowPrint.class)) {
            System.out.println("there is an annotation");
        } else {
            throw new DoNotAllowPrintException();
        }

        Class<? extends PrintClass> aClass = printClass.getClass();
        Method noPrint = aClass.getDeclaredMethod("noPrint");
        if (noPrint.isAnnotationPresent(AllowPrint.class)) {
            System.out.println("there is an annotation");
        } else {
            throw new DoNotAllowPrintException();
        }
//        boolean annotationPresent = print.isAnnotationPresent(AllowPrint.class);
//        System.out.println(annotationPresent);

    }

    @AllowPrint
    private void print() {

    }

    private void noPrint() {

    }

    @AllowPrint
    private void printAgain() {

    }

}
