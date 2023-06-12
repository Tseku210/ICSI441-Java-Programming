package org.example;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer");
        int number = input.nextInt();

        Predicate<Integer> divisibleBy2 = (n) -> n % 2 == 0;
        Predicate<Integer> divisibleBy3 = (n) -> n % 3 == 0;
        Predicate<Integer> divisibleBy2And3 = divisibleBy2.and(divisibleBy3);
        Predicate<Integer> divisibleBy2Or3 = divisibleBy2.or(divisibleBy3);


        if (divisibleBy2And3.test(number)) {
            System.out.println(number + " is divisible by 2 and 3");
        }
        if (divisibleBy2Or3.test(number)) {
            System.out.println(number + " is divisible by 2 or 3");
        }
        if (divisibleBy2Or3.test(number) && !divisibleBy2And3.test(number)) {
            System.out.println(number + " is divisible by 2 or 3, but not both");
        }
    }
}
