package org.example;

public class HeavyBox extends Box{
    private int weight;
    private String name;

    public HeavyBox(int w, int h, int d, int weight, String name) {
        super(w, h, d);
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
