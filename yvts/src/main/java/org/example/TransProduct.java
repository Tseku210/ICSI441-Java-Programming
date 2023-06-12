package org.example;

public class TransProduct extends Product {
    private int count;

    public TransProduct(String name, String desc, double cost, int count) {
        super(name, desc, cost);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
