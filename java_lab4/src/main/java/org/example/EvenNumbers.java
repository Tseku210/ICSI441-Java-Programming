package org.example;

import java.io.*;
import java.util.Random;

public class EvenNumbers{
    File file = new File("data.txt");
    int num;

    FileOutputStream fout;
    FileInputStream fin;

    public EvenNumbers() throws IOException {
        this(1);
    }

    public EvenNumbers(int num) throws IOException {
        this.num = num;
        try {
            fwrite();
            fread();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void fwrite() throws IOException {
        Random rand = new Random();
        fout = new FileOutputStream(file);
        System.out.println("writing");
        for (int i = 0; i < num; i++) {
            int r = rand.nextInt(100);
            System.out.println(r);
            fout.write(r);
        }

        fout.close();
    }

    void fread() throws IOException {
        fin = new FileInputStream(file);
        int counter = 0;
        System.out.println("reading");
        while (fin.available() != 0) {
            if (fin.read() % 2 == 0) {
                counter++;
            }
        }
        System.out.println((double)counter/num+ "%");
        fin.close();
    }

    public static void main(String[] args) {
        try {
            new EvenNumbers(10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
