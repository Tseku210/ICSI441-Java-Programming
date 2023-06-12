package org.example;

public class Customer {
    private String name;
    private double monthlyFee;
    private int months;

    public Customer(String name, double monthlyFee, int months) {
        this.name = name;
        this.monthlyFee = monthlyFee;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public int getMonths() {
        return months;
    }
}
