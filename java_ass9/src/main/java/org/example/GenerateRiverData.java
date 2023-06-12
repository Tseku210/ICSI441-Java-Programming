package org.example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenerateRiverData {

    public static void main(String[] args) {
        generateRiverData("rivers.bin");
    }

    public static void generateRiverData(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeUTF("River A");
            dos.writeInt(100);
            dos.writeInt(30);

            dos.writeUTF("River B");
            dos.writeInt(200);
            dos.writeInt(40);

            dos.writeUTF("River C");
            dos.writeInt(150);
            dos.writeInt(20);


            System.out.println("Binary file amjilttai nemegdlee.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

