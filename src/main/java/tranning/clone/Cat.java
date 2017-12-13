package tranning.clone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
public class Cat implements Serializable {

    private String name;
    private List<String> colors = new ArrayList<>();
    private int age;

    public Cat(String name, List<String> colors, int age) {
        this.name = name;
        this.colors.addAll(colors);
        this.age = age;
    }
}

class BasketCats {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat vaska = new Cat("Vaska", Collections.singletonList("Gray"), 4);

        byte[] serizlizeCat = serizlizeCat(vaska);
        System.out.println(Arrays.toString(serizlizeCat));

        Cat cloneVaska = deserializeCat(serizlizeCat);

        System.out.println(vaska);
        System.out.println(cloneVaska);
        System.out.println("*********************************************");
        cloneVaska.getColors().add("Black");
        System.out.println(vaska);
        System.out.println(cloneVaska);
    }

    private static Cat deserializeCat(byte[] serizlizeCat) throws IOException, ClassNotFoundException {
        Cat toReturn = null;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serizlizeCat);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            toReturn = (Cat) ois.readObject();
        }
        return toReturn;
    }

    private static byte[] serizlizeCat(Cat vaska) throws IOException {
        byte[] serializeCat;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream ous = new ObjectOutputStream(baos)) {
            ous.writeObject(vaska);
            serializeCat = baos.toByteArray();
        }
        return serializeCat;
    }
}
