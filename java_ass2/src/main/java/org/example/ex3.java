package org.example;

import java.io.*;

public class ex3 {
    public ex3() throws IOException {
        int width = 50;

        File inputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/ex3.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        File outputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                writer.write(line);
                writer.newLine();
            } else {
                String centered = centerString(line, width);
                writer.write(centered);
                writer.newLine();
            }
        }

        reader.close();
        writer.close();

        inputFile.delete();
        outputFile.renameTo(inputFile);
    }

    private String centerString(String line, int width) {
        int padding = width - line.length();
        int leftP = padding / 2;
        int rightP = padding - leftP;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < leftP; i++) {
            str.append(" ");
        }
        if (line.length() % 2 == 1) {
            str.append(" ");
        }
        str.append(line);
        for (int i = 0; i < rightP; i++) {
            str.append(" ");
        }

        return str.toString();
    }

    public static void main(String[] args) {
        try {
            new ex3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
