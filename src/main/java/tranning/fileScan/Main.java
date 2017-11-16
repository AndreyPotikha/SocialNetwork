package tranning.fileScan;

import java.util.Random;

import static java.awt.SystemColor.text;

public class Main {

    public static void main(String[] args) {

        FileServiceFromScan serviceFromScan = new FileServiceFromScanImpl();
        Random random = new Random();
        int number = random.nextInt(3) + 1;
        System.out.println(number);
        serviceFromScan.write("Alex", number);
    }
}
