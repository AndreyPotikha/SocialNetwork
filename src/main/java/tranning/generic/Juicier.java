package tranning.generic;

import tranning.generic.fruits.*;

import java.util.ArrayList;
import java.util.List;

public class Juicier <T extends Object&Fruit> {

    public void makeJuice(T fruit) {
        if (fruit instanceof Orange) {
            System.out.println("Have you peeled the orange?");
        }
        System.out.println("We've made " + fruit.squeeze());
    }

    public void makeJuice(List<T> fruits) {
        fruits.forEach(fruit ->
                System.out.println("We've made " + fruit.squeeze()));
    }

    public static void main(String[] args) {
        Juicier<Apple> appleJuicier = new Juicier<>();
        appleJuicier.makeJuice(new Apple());
//        appleJuicier.makeJuice(new Mecintosh());
        appleJuicier.makeJuice(new ArrayList<Apple>());
//        appleJuicier.makeJuice(new ArrayList<Mecintosh>()); //exception
//        appleJuicier.makeJuice(new Pineapple); //exception

        Juicier<Orange> orangeJuicier = new Juicier<>();
        orangeJuicier.makeJuice(new Orange());
    }

}
