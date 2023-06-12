package org.example;

public class Maximum implements Runnable {
    private int[] array;
    private int max;

    public Maximum(int[] array) {
        this.array = array;
    }

    int getMax() {
        return max;
    }

    @Override
    public void run() {
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }
}
