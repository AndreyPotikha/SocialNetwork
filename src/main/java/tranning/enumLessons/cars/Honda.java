package tranning.enumLessons.cars;

public class Honda extends Car{

    @Override
    public Car drive() {
        System.out.println("My car: " + CarType.HONDA);
        return null;
    }
}
