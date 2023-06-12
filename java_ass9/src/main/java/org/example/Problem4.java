package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        List<Integer> primes = findPrimes(n);
        System.out.println("Prime numbers less than or equal to " + n + ":");
        primes.forEach(System.out::println);

        scanner.close();
    }

    public static List<Integer> findPrimes(int n) {
        Predicate<Integer> isPrime = num -> {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime.test(i)) {
                primes.add(i);
            }
        }

        return primes;
    }
}
