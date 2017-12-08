package tranning.compare.myTestCompar;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getAge().compareTo(car2.getAge());
    }
}
