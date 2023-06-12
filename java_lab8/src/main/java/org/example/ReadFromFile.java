package org.example;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadFromFile {
    File file;

    public ReadFromFile(String filename) throws IOException {
        file = new File(filename);
    }

    void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        System.out.println(file.getName() + ": ");
        while (line != null) {
            System.out.println(line + " ");
            line = reader.readLine();
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new ReadThread("src/data1.txt"));
        executor.execute(new ReadThread("src/data2.txt"));
        executor.execute(new ReadThread("src/data3.txt"));

        executor.shutdown();

//        ReadThread th1 = new ReadThread("src/data1.txt");
//        ReadThread th2 = new ReadThread("src/data2.txt");
//        ReadThread th3 = new ReadThread("src/data3.txt");
//        th1.setPriority(3);
//        th2.setPriority(2);
//        th3.setPriority(1);
//        th1.start();
//        th2.start();
//        th3.start();
    }
}
