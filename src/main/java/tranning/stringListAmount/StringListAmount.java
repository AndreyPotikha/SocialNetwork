package tranning.stringListAmount;

import java.util.ArrayList;
import java.util.List;

public class StringListAmount {

    public static void main(String[] args) {

        stringList();
    }

    private static void stringList() {
        double finalSum = 0;
        List<String> list = new ArrayList<>();
        list.add("0.0001");
        list.add("0.0001");
        list.add("0.0001");

        for (String elem : list) {
            Double sum = Double.valueOf(elem);
            finalSum += sum;
        }

    System.out.println(String.format("%.4f", finalSum));

    }

}
