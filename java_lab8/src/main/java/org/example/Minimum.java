package org.example;

public class Minimum implements Runnable{
    private int[] array;
    private int min;

    public Minimum(int[] array) {
        this.array = array;
    }

    int getMin() {
        return min;
    }

    @Override
    public void run() {
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
    }
}
