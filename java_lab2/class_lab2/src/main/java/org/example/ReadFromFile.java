package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    File file;


    public ReadFromFile() throws FileNotFoundException {
        file = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_lab2/class_lab2/src/main/resources/firstFile.txt");
        int m;
        Scanner inp = new Scanner(file);

        while(inp.hasNext()) {
            System.out.println(inp.nextLine());
        }

        inp.close();
    }

    boolean read() {

        return false;
    }

    public static void main(String[] args) {
        try {
            new ReadFromFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
