package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DescendingOrder {
    File file;
    ArrayList<String> list;

    public DescendingOrder() {
        list = new ArrayList<>();
        file = new File("src/Words.txt");
        readFile();
        Collections.sort(list);
        System.out.println(list);
    }

    void readFile() {
        Scanner input = null;
        String tmp = null;
        String word[];
        try {
            input = new Scanner(file);

            while (input.hasNext()) {
                tmp = "" + input.next();
                word = tmp.split("[()-.,+?]");

                for (String str : word)
                    list.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(list);
            input.close();
        }
    }

    public static void main(String[] args) {
        new DescendingOrder();
    }
}