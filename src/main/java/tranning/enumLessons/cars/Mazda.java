package tranning.enumLessons.cars;

public class Mazda extends Car{

    @Override
    public Car drive() {
        System.out.println("My car: " + CarType.MAZDA);
        return null;
    }
}
