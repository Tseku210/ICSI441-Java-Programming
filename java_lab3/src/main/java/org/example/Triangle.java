package org.example;

import java.util.Date;

public class Triangle extends GeometricObject{
    double side1, side2, side3;
    public Triangle() {
//        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (!this.isTriangle()) {
            System.out.println("Iim gurvaljin baihgui");
            System.exit(0);
        }
    }

    protected Triangle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public Date getDateCreated() {
        return super.getDateCreated();
    }

    @Override
    public double getArea() {
        double p = this.getPermineter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double getPermineter() {
        return side1 + side2 + side3;
    }

    boolean isTriangle() {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.side1 + "\n" + this.side2 + "\n" + this.side3
                + "\n area: " + this.getArea()
                + "\n perimeter: " + this.getPermineter();
    }
}
