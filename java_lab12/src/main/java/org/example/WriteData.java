package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class WriteData {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        BiConsumer<PrintWriter, String> print = PrintWriter::print;
        BiConsumer<PrintWriter, String> println = print.andThen(PrintWriter::println);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();
    }
}
