package tranning.annotation.three;

public class DoNotAllowPrintException extends RuntimeException{
    @Override
    public void printStackTrace() {
        System.out.println("there is not an annotation");
    }
}
