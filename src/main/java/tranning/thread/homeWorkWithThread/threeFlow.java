package tranning.thread.homeWorkWithThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class threeFlow {

    private static List<Integer> firstList = new ArrayList<>();
    private static List<Integer> secondList = new ArrayList<>();
    private static List<Integer> finalList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        FirstWrite firstWrite = new FirstWrite();
        firstWrite.start();
        SecondWrite secondWrite = new SecondWrite();
        secondWrite.start();
        secondWrite.join();
        FinalWrite finalWrite = new FinalWrite();
        finalWrite.start();
        finalWrite.join();
        System.out.println(firstList);
        System.out.println(secondList);
        System.out.println(finalList);
    }

    private static class FirstWrite extends Thread {

        @Override
        public void run() {
            for (int i = 2; i <= 12; i+=2) {
                firstList.add(i);
            }
        }
    }

    private static class SecondWrite extends Thread {

        @Override
        public void run() {
            for (int i = 1; i < 12; i += 2) {
                secondList.add(i);
            }
        }
    }

    private static class FinalWrite extends Thread {

        @Override
        public void run() {
            finalList.addAll(secondList);
            finalList.addAll(firstList);
            Collections.sort(finalList);
        }
    }

}
