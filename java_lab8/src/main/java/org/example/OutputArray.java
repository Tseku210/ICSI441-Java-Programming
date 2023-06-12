package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OutputArray extends Thread{
    int[] arr;
    Write2File out;

    public OutputArray(int[] arr) throws FileNotFoundException {
        this.arr = arr;
        this.out = new Write2File();
    }

    public OutputArray(String filename, int[] arr) throws IOException {
        this.arr = arr;
        this.out = new Write2File(filename);
    }

    @Override
    public void run() {
        try {
            out.append(arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
