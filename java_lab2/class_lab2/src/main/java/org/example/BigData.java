package org.example;

import java.util.ArrayList;
import java.util.Random;

public class BigData {

    ArrayList<Faculty> data = new ArrayList<>();
    Random rand = new Random();

    public BigData() {
        int rank;
        for (int i = 0; i < 10; i++) {
            rank = rand.nextInt(3);
//            new Faculty("firstName" + i+1, "lastName" + i+1, );
        }
    }

    double getSalary(int rank) {
        Random random = new Random();
        double salary;
        switch (rank) {
            case 0:
                random.nextDouble();

        }
        return 0;
    }

    public static void main(String[] args) {
        new BigData();
    }
}
