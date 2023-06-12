package org.example;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class QuotientWithMethod {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        BiFunction<Integer, Integer, Integer> quotientFunction = QuotientWithMethod::quotient;
        Integer result = quotientFunction.apply(number1, number2);
        System.out.println("Result: " + result);
    }
}
