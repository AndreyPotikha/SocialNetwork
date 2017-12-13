package tranning.thread;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Write write = new Write();
        write.start();
        Read read = new Read();
        read.start();

    }

    private static class Write extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                list.add(i);
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    private static class Read extends Thread {

        @Override
        public void run() {
            System.out.println(list);
            System.out.println(Thread.currentThread().getName());
        }
    }




}
