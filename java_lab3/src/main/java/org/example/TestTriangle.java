package org.example;

import java.util.Scanner;

public class TestTriangle {
    double a, b, c;
    String color;
    Boolean filled;

    Triangle tri;

    public TestTriangle() {
        input();
        tri = new Triangle(a, b, c, color, filled);
        System.out.print(tri.toString());
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Gurvaljinii taluudiig oruul: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        System.out.print("Gurvaljinii ungu oruul: ");
        color = in.next();

        System.out.print("Gurvaljinii budagdsan eseh: ");
        filled = in.nextBoolean();
    }

    public static void main(String[] args) {
        new TestTriangle();
    }
}
