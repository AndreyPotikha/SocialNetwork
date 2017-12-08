package tranning.compare.myTestCompar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Start {

    private static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {

        Car car1 = new Car("Opel", 1990, 'o', "full");
        Car car2 = new Car("Seat", 2000, 's', "not full");
        Car car3 = new Car("BMW", 2010, 'b', "not full");
        Car car4 = new Car("Ford", 1985, 'f', "full");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);

        System.out.println(cars);

        Collections.sort(cars, new CarYearComparator());

        System.out.println(cars);
    }
}
