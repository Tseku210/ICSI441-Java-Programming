package org.example;

import java.io.*;

public class Write2File {
    File file;
    int[] arr;

    public Write2File() {

    }
    public Write2File(String file) throws IOException {
        this.file = new File(file);
//        outputFile(this.file, arr);
    }

    public Write2File(int[] arr) throws IOException {
        this.arr = arr;
        outputFile(file, this.arr);
    }


    void outputFile(File file, int[] arr) throws IOException {
        PrintWriter fileWriter = new PrintWriter(file);

        for (int i = 0; i < arr.length; i++) {
            fileWriter.write(arr[i] + " ");
        }
        fileWriter.close();
    }

    private void appendToFile(File file, int[] arr) throws IOException {
        PrintWriter fileWriter = new PrintWriter(file);
        for (int i = 0; i < arr.length; i++) {
            fileWriter.write(arr[i] + " ");
        }
        fileWriter.close();
    }

    public void append(int[] arr) throws IOException {
        appendToFile(file, arr);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("src/data1.txt");
        if (file.exists()) {
            file.delete();
        }
        OutputArray o1 = new OutputArray("src/data1.txt", new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1});
        OutputArray o2 = new OutputArray("src/data2.txt", new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2});
        OutputArray o3 = new OutputArray("src/data3.txt", new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3});
        o1.start();
        o2.start();
        o3.start();
    }
}
