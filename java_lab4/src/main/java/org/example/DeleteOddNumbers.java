package org.example;

import java.io.*;
import java.util.Random;

public class DeleteOddNumbers {
    File file = new File("data.txt");
    DataInputStream fin;
    DataOutputStream fout;

    Integer firstOdd;
    Integer lastOdd;
    int lastOddIndex;
    int i = 0;
    StringBuilder str;
    Integer firstNeg;
    Integer lastNeg;

    public DeleteOddNumbers() throws IOException {
//        fin = new DataInputStream(file);
////        fout = new FileOutputStream(file);
//        PrintWriter out = new PrintWriter(file);
//        str = new StringBuilder();
//        while (fin.available() != 0) {
//            int r = fin.read();
//            System.out.println(r);
//            if (r % 2 == 0) {
//                str.append(r);
//            } else {
//                if (firstOdd == null) {
//                    firstOdd = r;
//                    str.append(firstOdd);
//                }
//                lastOdd = r;
//                lastOddIndex = i;
//            }
//            i++;
//        }
//        out.println(str);
//        fin.close();
        writef();
        readf();
    }

    void writef() throws IOException {
        fout = new DataOutputStream(new FileOutputStream(file));
        for (int i = 0; i < 100; i++) {
            int rand = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            fout.writeInt(rand);
        }
        fout.close();
    }

    void readf() throws IOException {
        fin = new DataInputStream(new FileInputStream(file));
        fout = new DataOutputStream(new FileOutputStream("out.txt"));
        while (true) {
            try {
                int num = fin.readInt();
                if (num < 0) {
                    if (firstNeg == null) {
                        firstNeg = num;
                        fout.writeInt(firstNeg);
                    }
                    lastNeg = num;
                }

            } catch (EOFException e) {
//                System.out.println(e);
                fin.close();
                break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        try {
            new DeleteOddNumbers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
