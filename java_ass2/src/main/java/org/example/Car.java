package org.example;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Car {
    double x, y, dir;

    public Car(double xx, double yy, double d) {
        this.x = xx;
        this.y = yy;
        this.dir = d;
    }

    void move(double len) {
        x += len * cos(dir);
        y += len * sin(dir);
    }

    void setDir(double nd) {
        dir = nd;
    }
}
