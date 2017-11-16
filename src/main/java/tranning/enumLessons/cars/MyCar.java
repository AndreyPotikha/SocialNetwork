package tranning.enumLessons.cars;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Arrays;

import static tranning.enumLessons.cars.CarType.*;

public class MyCar {

    public static void main(String[] args) {

        Car car = FactoryCar.getImplCar(CarType.MAZDA);
        car.drive();
    }
}
