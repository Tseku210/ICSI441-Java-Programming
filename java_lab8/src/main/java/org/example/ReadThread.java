package org.example;

import java.io.IOException;

public class ReadThread extends Thread{

    ReadFromFile read;

    ReadThread(String filename) throws IOException {
        read = new ReadFromFile(filename);
    }

    @Override
    public void run() {
        try {
            read.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
