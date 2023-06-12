package org.example;

public class Box {
    public int width;
    public int height;
    public int depth;

    public Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    public Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    public Box(int len) {
        width = height = depth = len;
    }

}
