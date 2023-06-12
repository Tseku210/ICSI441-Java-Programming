package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class SerializableDemo {

    ArrayList<Loan> list;
    ObjectOutputStream fout;
    ObjectInputStream fin;
    File file = new File("objects.dat");
    SerializableDemo() throws IOException, ClassNotFoundException {
        list = new ArrayList<>();
        list.add(new Loan(7.5, 5, 5000));
        list.add(new Loan(3.5, 2, 10000));
        list.add(new Loan(1.5, 51, 123000));
        list.add(new Loan(5.5, 1, 53000));
        list.add(new Loan(8.8, 10, 44000));
        outf();
        readf();
    }

    void outf() throws IOException {
        fout = new ObjectOutputStream(new FileOutputStream(file));
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
            fout.writeObject(list.get(i));
        }
        fout.close();
    }

    void readf() throws IOException, ClassNotFoundException {
        fin = new ObjectInputStream(new FileInputStream(file));

        while (fin.available() != -1) {
            System.out.println("here");
            System.out.println(fin.readObject());
        }
        fin.close();
    }

    public static void main(String[] args) {
        try {
            new SerializableDemo();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
