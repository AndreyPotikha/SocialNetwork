package tranning.change;

import tranning.FileService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        FileServiceChange fileServiceChangeRead = new FileServiceChangeImpl();
        String readFle = fileServiceChangeRead.read();
        char[] change = readFle.toCharArray();
        for (int i = 0; i < readFle.length(); i++) {
            if (change[i] == '(') {
                change[i] = ')';
//                System.out.println(Arrays.toString(change));
            }
        }
        readFle = "";
        for (int i = 0; i < change.length; i++) {
            readFle += change[i];
        }
        FileServiceChange fileServiceChange = new FileServiceChangeImpl();
        fileServiceChange.write(readFle);

    }
}
