package org.example;

public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {
        this.side = 1;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public boolean howToColor() {
        System.out.println("Color all four sides");
        return true;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPermineter() {
        return 0;
    }
}
