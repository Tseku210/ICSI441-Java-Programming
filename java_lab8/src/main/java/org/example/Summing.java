package org.example;

public class Summing implements Runnable{
    Integer sum;

    Summing(Integer sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        sum();
    }

    synchronized void sum() {
        sum++;
    }

    Integer getSum() {
        return sum;
    }
}
