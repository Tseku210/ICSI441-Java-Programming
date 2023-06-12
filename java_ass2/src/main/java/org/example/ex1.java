package org.example;

import java.io.*;

public class ex1 {

    public ex1() throws IOException {
        File inputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/firstFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        File outputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                writer.write(line);
                writer.newLine();
            }
        }

        reader.close();
        writer.close();

        inputFile.delete();
        outputFile.renameTo(inputFile);
    }

    public static void main(String[] args) {
        try {
            new ex1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
