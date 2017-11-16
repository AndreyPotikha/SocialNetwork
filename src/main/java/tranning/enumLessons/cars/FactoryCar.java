package tranning.enumLessons.cars;

public class FactoryCar {

    public static Car getImplCar(CarType carType) {

        switch (carType) {
            case MAZDA:
                return new Mazda();
            case HONDA:
                return new Honda();
            default:
                return null;
        }
    }
}
