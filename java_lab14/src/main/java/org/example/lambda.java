package org.example;

import java.util.List;
import java.util.concurrent.*;

public class lambda {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CallablePrime primeCallable = new CallablePrime();

        Future<List<Integer>> future = executorService.submit(primeCallable);

        try {
            List<Integer> primeNumbers = future.get();
            System.out.println("Prime numbers between 1 and 1000:");
            primeNumbers.forEach(System.out::println);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
