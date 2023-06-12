package org.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Problem7 {
    public static void main(String[] args) {
        double priceDifference = calculatePriceDifference("internet_service.bin");
        System.out.println("Zoruu: $" + priceDifference);
    }

    public static double calculatePriceDifference(String fileName) {
        List<Customer> customers = readCustomersFromFile(fileName);

        double totalWithoutDiscount = customers.stream()
                .mapToDouble(customer -> customer.getMonthlyFee() * customer.getMonths())
                .sum();

        double totalWithDiscount = customers.stream()
                .mapToDouble(Problem7::applyDiscount)
                .sum();

        return totalWithoutDiscount - totalWithDiscount;
    }

    public static List<Customer> readCustomersFromFile(String fileName) {
        List<Customer> customers = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                String name = dis.readUTF();
                double monthlyFee = dis.readDouble();
                int months = dis.readInt();

                customers.add(new Customer(name, monthlyFee, months));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customers;
    }

    public static double applyDiscount(Customer customer) {
        if (customer.getMonths() >= 3) {
            return customer.getMonthlyFee() * customer.getMonths() * (1 - 0.07);
        } else {
            return customer.getMonthlyFee() * customer.getMonths();
        }
    }
}
