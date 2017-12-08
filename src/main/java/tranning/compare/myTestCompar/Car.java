package tranning.compare.myTestCompar;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Comparable<Car>{



    private String name;
    private Integer age;
    private Character model;
    private String complit;


    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.getName());
    }
}
