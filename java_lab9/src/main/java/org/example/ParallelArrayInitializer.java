package org.example;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ParallelArrayInitializer {

    private double[] list;
    Random random = new Random();
    public ParallelArrayInitializer() {
        list = new double[9000000];
        System.out.println(sequentialInit() + " ms");
        System.out.println(parallelInit() + " ms");
    }

    long sequentialInit() {
        long startTime = System.nanoTime();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextDouble(20000);
        }
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    long parallelInit() {
        long startTime = System.nanoTime();
        ArrayInitTask task = new ArrayInitTask(list, 0, list.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        new ParallelArrayInitializer();
    }
}
