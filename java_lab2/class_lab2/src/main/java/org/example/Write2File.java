package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Write2File {
    // bodlogo 2
    // 2 text file ugugduv. Ehnii text file iin aguulgiig 2 dahi text file iin tugsguld nemj bichne uu
//    File file1;
//    File file2;
//
//    public Write2File() {
//        file1 = new File("firstFile.txt");
//        file2 = new File("secondFile.txt");
//    }
//
//    void run() {
//
//    }


    // bodlogo1

    File file;
    int n, k;
    public Write2File() throws FileNotFoundException {
        file = new File("stars.txt");
        input();
        output();
    }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("2 buhel too oruul");
        n = input.nextInt();
        k = input.nextInt();
    }

    void output() throws FileNotFoundException {
        StringBuilder str = new StringBuilder();
        java.io.PrintWriter print = new java.io.PrintWriter(file);
        for (int i = 0; i < k; i++)
            str.append("*");

        for (int i = 0; i < n; i++) {
            print.write(str + "\n");
        }
        print.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Write2File();
    }
}
