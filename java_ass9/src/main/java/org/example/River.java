package org.example;

public class River {
    private String name;
    private int length;
    private int averageDepth;

    public River(String name, int length, int averageDepth) {
        this.name = name;
        this.length = length;
        this.averageDepth = averageDepth;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getAverageDepth() {
        return averageDepth;
    }
}
