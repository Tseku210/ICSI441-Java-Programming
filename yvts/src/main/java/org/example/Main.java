package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private static LocalDate lastWeek = LocalDate.now().minusWeeks(1);

    public static void main(String[] args) {
        ArrayList<Transaction> transactions = new ArrayList<>();

        ArrayList<TransProduct> order1 = new ArrayList<>();
        order1.add(new TransProduct("Computer", "Mac", 1100, 1));
        order1.add(new TransProduct("Mouse", "Magic mouse", 100, 1));
        ArrayList<TransProduct> order2 = new ArrayList<>();
        order1.add(new TransProduct("Pichen", "Hrustik", 2, 1));
        order1.add(new TransProduct("Burger", "Mongol", 5, 1));
        ArrayList<TransProduct> order3 = new ArrayList<>();
        order1.add(new TransProduct("Pen", "Hrustik", 2, 1));
        order1.add(new TransProduct("Love", "Mongol", 5, 1));

        transactions.add(new Transaction(1, LocalDate.parse("2023-03-22"), order1));
        transactions.add(new Transaction(2, LocalDate.parse("2023-03-30"), order2));
        transactions.add(new Transaction(3, LocalDate.now(), order3));
        transactions.add(new Transaction(4, LocalDate.now()));
        transactions.add(new Transaction(5, LocalDate.now()));

        //1.
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }

        //2.
        double maxPrice;
        System.out.println("Дээд үнэ оруулна уу: ");
        Scanner in = new Scanner(System.in);
        maxPrice = in.nextInt();

        findOrdersByPriceAndItems(transactions, maxPrice);

        //3.
        System.out.println("Барааны нэр оруулна уу: ");
        Scanner in2 = new Scanner(System.in);
        String prodName = in2.nextLine();
        findOrdersByProduct(transactions, prodName);

        //4.
        findWithoutProductLastWeek(transactions, "Computer");

        //5.
        Transaction transaction = new Transaction(6, LocalDate.now().plusDays(1));
        TransProduct computer = new TransProduct("Coffee", "Mac", 30, 1);
        TransProduct mouse = new TransProduct("Lemonade", "Magic mouse", 20, 1);
        transaction.addProduct(computer);
        transaction.addProduct(mouse);
        System.out.println(transaction);

        //6.
        transactions = removeGivenNumberOfTimes(transactions, "Computer", 1);

    }

    public static ArrayList<Integer> findOrdersByPriceAndItems(ArrayList<Transaction> transactions, double maxPrice) {
        ArrayList<Integer> orderIds = new ArrayList<>();

        for (Transaction transaction : transactions) {
            double totalPrice = 0;
            HashSet<String> itemNames = new HashSet<>();

            for (TransProduct product : transaction.getProducts()) {
                totalPrice += product.getCost() * product.getCount();
                itemNames.add(product.getName());
            }

            if (totalPrice <= maxPrice) {
                orderIds.add(transaction.getId());
                System.out.println("Transaction ID: " + transaction.getId());
                System.out.println("Ялгаатай барааны тоо: : " + itemNames.size());
            }
        }

        return orderIds;
    }

    public static void findOrdersByProduct(ArrayList<Transaction> transactions, String productName) {
        System.out.println("Orders " + productName + ":");

        for (Transaction transaction : transactions) {
            boolean containsProduct = false;

            for (TransProduct product : transaction.getProducts()) {
                if (product.getName().equals(productName)) {
                    containsProduct = true;
                    break;
                }
            }

            if (containsProduct) {
                System.out.println("Агуулж буй transaction id - " + transaction.getId());
            }
        }

    }

    public static void findWithoutProductLastWeek(ArrayList<Transaction> transactions, String productName) {
        for (Transaction transaction : transactions) {
            if (transaction.getDate().isBefore(lastWeek)) {
                for (TransProduct product : transaction.getProducts()) {
                    boolean found = false;
                    if (product.getName().equals(productName)) {
                        found = true;
                    }

                    if (!found) {
                        System.out.println("Transaction ID: " + transaction.getId());
                    }
                }
            }
        }
    }

    public static ArrayList<Transaction> removeGivenNumberOfTimes(ArrayList<Transaction> transactions, String productName, int num) {
        ArrayList<Transaction> newTransList = new ArrayList<>();

        for (Transaction transaction : transactions) {
            int count = 0;
            for (TransProduct product : transaction.getProducts()) {
                if (product.getName().equals(productName)) {
                    count += product.getCount();
                }
            }
            if (count != num) {
                newTransList.add(transaction);
            }
        }

        return newTransList;
    }
}