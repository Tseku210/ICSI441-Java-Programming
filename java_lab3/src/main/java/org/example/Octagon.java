package org.example;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{

    private double side;

    public Octagon() {
        this.side = 0;
    }

    public Octagon(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPermineter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() > ((Octagon)o).getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
