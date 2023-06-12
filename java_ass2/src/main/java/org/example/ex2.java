package org.example;

import java.io.*;
import java.util.Scanner;

public class ex2 {
    public ex2() throws IOException {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        File inputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/ex2.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        File outputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.length() <= k) {
                line = "";
            } else {
                line = line.substring(k);
            }
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();

        inputFile.delete();
        outputFile.renameTo(inputFile);
    }

    public static void main(String[] args) {
        try {
            new ex2();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
