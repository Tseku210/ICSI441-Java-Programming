package org.example;

public class MinMax {

    int[] arr = {1, 5, 2, 7, 8, 29};
    Thread thread1, thread2;

    Maximum maxTask;
    Minimum minTask;

    public MinMax() {
        maxTask = new Maximum(arr);
        minTask = new Minimum(arr);
        thread1 = new Thread(maxTask);
        thread2 = new Thread(minTask);
        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Max task: " + maxTask.getMax());
        System.out.println("Min task: " + minTask.getMin());
    }


    public static void main(String[] args) {
        new MinMax();
    }
}
