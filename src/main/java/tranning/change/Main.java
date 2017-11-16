package tranning.change;

import tranning.FileService;

public class Main {

    public static void main(String[] args) {

        FileServiceChange fileServiceChangeRead = new FileServiceChangeImpl();
        String readFle = fileServiceChangeRead.read();
        char[] change = readFle.toCharArray();
        for (int i = 0; i < readFle.length() - 1; i++) {
            if (change.equals('(')) {
                change[i] = ')';
            }
        }


        FileServiceChange fileServiceChange = new FileServiceChangeImpl();
        fileServiceChange.write();

    }
}
