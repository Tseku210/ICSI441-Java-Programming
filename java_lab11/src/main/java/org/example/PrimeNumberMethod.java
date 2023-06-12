package org.example;

@FunctionalInterface
interface PrimeNumber {
    void print(int numberOfPrimes);
}

@FunctionalInterface
interface IsPrime {
    boolean isPrime(int number);
}


public class PrimeNumberMethod {

    PrimeNumber primeNumber;
    IsPrime isPrime;

    public PrimeNumberMethod(int num) {
        primeNumber = (n) -> {
            final int NUMBER_OF_PRIMES_PER_LINE = 10;
            int count = 0;
            int number = 2;

            while (count < n) {
                if (isPrime.isPrime(number)) {
                    count++;
                    if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                        System.out.printf("%-5d\n", number);
                    } else {
                        System.out.printf("%-5d", number);
                    }
                }
                number++;
            }
        };

        isPrime = (n) -> {
            for (int divisor = 2; divisor <= n / 2; divisor++) {
                if (n % divisor == 0) {
                    return false;
                }
            }

            return true;
        };


        primeNumber.print(num);
    }

    public static void main(String[] args) {
       new PrimeNumberMethod(100);
    }
}
