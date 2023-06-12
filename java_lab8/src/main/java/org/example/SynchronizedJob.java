package org.example;

import java.util.ArrayList;

public class SynchronizedJob {
    ArrayList<Thread> threads = new ArrayList<>();
    Summing summing = new Summing(0);

    public SynchronizedJob() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            threads.add(new Thread(summing));
        }

        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
            threads.get(i).join();
        }

        System.out.println(summing.getSum());
    }


    public static void main(String[] args) throws InterruptedException {
        SynchronizedJob obj = new SynchronizedJob();
//        System.out.println("sum: " + obj);
    }
}
