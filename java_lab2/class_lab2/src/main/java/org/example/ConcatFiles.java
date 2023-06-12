package org.example;

import java.io.*;
import java.util.Scanner;

public class ConcatFiles {
    public ConcatFiles() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("/Users/tsenguunotgonbaatar/dev/java_programming/java_lab2/class_lab2/src/main/resources/firstFile.txt", true));
        BufferedReader in = new BufferedReader(new FileReader("/Users/tsenguunotgonbaatar/dev/java_programming/java_lab2/class_lab2/src/main/resources/secondFile.txt"));
        String str;
        while ((str = in.readLine()) != null) {
            out.write(str);
        }
        in.close();
        out.close();
    }

    public static void main(String[] args) {
        try {
            new ConcatFiles();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
