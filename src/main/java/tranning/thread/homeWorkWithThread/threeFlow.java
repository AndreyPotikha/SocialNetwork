package tranning.thread.homeWorkWithThread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class threeFlow {

    private static List<Integer> firstList;
    private static List<Integer> secondList;
    private static List<Integer> finalList;

    public static void main(String[] args) throws InterruptedException {

        FirstWrite firstWrite = new FirstWrite();
        firstWrite.start();
        SecondWrite secondWrite = new SecondWrite();
        secondWrite.start();
        secondWrite.join();
       /* FinalWrite finalWrite = new FinalWrite();
        finalWrite.start();
        finalWrite.join();*/
        System.out.println(firstList);
        System.out.println(secondList);
        for (Integer elem : firstList) {
            System.out.println(elem);
            finalList.add(elem);
        }


    }

    private static class FirstWrite extends Thread {

        @Override
        public void run() {
            IntStream stream = IntStream.of(2, 4, 6, 8, 10, 12);
            firstList = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        }
    }

    private static class SecondWrite extends Thread {

        @Override
        public void run() {
            IntStream stream = IntStream.of(1, 3, 5, 7, 9, 11);
            secondList = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
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
