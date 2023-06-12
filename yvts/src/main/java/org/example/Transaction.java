package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private int id;
    private ArrayList<TransProduct> products;
    private LocalDate date;

    public Transaction(int id, LocalDate date) {
        this.id = id;
        this.products = new ArrayList<>();
        this.date = date;
    }

    public Transaction(int id, LocalDate date, ArrayList<TransProduct> products) {
        this.id = id;
        this.date = date;
        this.products = new ArrayList<>();
        this.products.addAll(products);
    }

    public void addProduct(TransProduct product) {
        if (!products.contains(product)) {
            products.add(product);
        } else {
            int i = products.indexOf(product);
            products.get(i).addCount(1);
        }
    }

    public void addProducts(TransProduct product, int count) {
        if (!products.contains(product)) {
            product.addCount(count);
            products.add(product);
        } else {
            int i = products.indexOf(product);
            products.get(i).addCount(count);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<TransProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<TransProduct> products) {
        this.products = products;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Transaction ID: ")
                .append(this.id)
                .append(" Transaction Date: ")
                .append(this.date)
                .append(" Products: ");

        for (TransProduct product : products) {
            str.append("\n- " + product.getName() + " (count: " + product.getCount() + ", price: " + product.getCost() + ")");
        }
        return str.toString();
    }
}
