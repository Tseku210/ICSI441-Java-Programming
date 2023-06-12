package org.example;

import java.util.Scanner;
import java.util.function.Function;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of point A: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate of point A: ");
        double y = scanner.nextDouble();

        boolean isInArea = isPointInArea(x, y);
        System.out.println("Is point A in the area? " + (isInArea ? "Yes" : "No"));

        scanner.close();
    }

    public static boolean isPointInArea(double x, double y) {
        Function<Double, Double> parabola = (inputX) -> 2 - Math.pow(inputX, 2);

        double parabolaY = parabola.apply(x);

        return y >= parabolaY && y >= -2;
    }
}
