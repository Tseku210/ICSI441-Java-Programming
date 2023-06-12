package org.example;

import java.util.function.Function;

public class problem1 {
    public static void main(String[] args) {
        double k = 1000;
        double p = 5;
        double s = 20000;

        int years = calculateYears(k, p, s);
        System.out.println("Shaardagdah jil: " + years);
    }

    public static int calculateYears(double price, double intRate, double target) {
        Function<Double, Double> calcNextMonthMoney = (money) -> money + (money * (intRate / 100));
        Function<Double, Integer> calculateYearsToTake = (money) -> {
            int years = 0;
            double currentMoney = money;

            while (currentMoney < target) {
                currentMoney = calcNextMonthMoney.apply(currentMoney);
                years++;
            }

            return years;
        };

        return calculateYearsToTake.apply(price);
    }
}
