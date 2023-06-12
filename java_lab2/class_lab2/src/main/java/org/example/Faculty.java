package org.example;

import java.io.File;

// 1000 mur buhii file uusge. Mur bolgon bagshiin ner, ovog, rank, salary.
// The rank is generated randomly. Assistant, associate, and full.
// salary with 2 decimal point
// assistant 50-80k associate 60 - 110k full 75 = 130k
public class Faculty {
    String firstName, lastName;
    int rank;
    double salary;
    public Faculty() {
        this("", "", -1, 0.0);
    }

    public Faculty(String fname, String lname, int rank, double salary) {
        this.firstName = fname;
        this.lastName = lname;
        this.rank = rank;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstName +
                " " + this.lastName +
                "\n" + "Rank: " +
                this.rank + "\n" +
                "Salary: " +
                this.salary;
    }
}
