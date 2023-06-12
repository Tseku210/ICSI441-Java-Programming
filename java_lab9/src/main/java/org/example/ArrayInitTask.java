package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class ArrayInitTask extends RecursiveAction {
    private final static int THRESHOLD = 10000;
    private double[] list;
    private int high;
    private int low;
    Random random = new Random();

    public ArrayInitTask(double[] list, int low, int high) {
        this.list = list;
        this.low = low;
        this.high = high;
    }

    @Override
    protected void compute() {
        if (high - low < THRESHOLD) {
            for (int i = low; i < high; i++) {
                list[i] = random.nextDouble() * 20000;
            }
        } else {
            int mid = (low + high) / 2;
            ArrayInitTask left = new ArrayInitTask(list, low, mid);
            ArrayInitTask right = new ArrayInitTask(list, mid, high);

            right.fork();
            left.fork();
        }
    }
}
