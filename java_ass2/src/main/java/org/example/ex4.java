package org.example;

import java.io.*;
import java.util.Scanner;

public class ex4 {
    public ex4() throws IOException {
        File outputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/ex4.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        int A, B, N;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        N = input.nextInt();
        double step = (double) (B - A) / N;

        StringBuilder str = new StringBuilder();
        for (int i = A; i <= B; i += step) {
            double x = i + step;
            double sqrtx = Math.sqrt(x);
            str.append(String.format("%.4f", x));
            while (str.length() < 15) {
                str.insert(0, "0");
            }
            str.append(" ");
            StringBuilder sqrt = new StringBuilder(String.format("%.8f", sqrtx));
            while (sqrt.length() < 24) {
                sqrt.insert(0, "0");
            }
            str.append(sqrt);
            writer.write(str.toString());
            writer.newLine();
            str = new StringBuilder();
        }

        writer.close();
    }

    public static void main(String[] args) {
        try {
            new ex4();
        } catch( IOException e) {
            e.printStackTrace();
        }
    }
}
