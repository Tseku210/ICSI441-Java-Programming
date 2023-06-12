package org.example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenerateCustomerData {

    public static void main(String[] args) {
        generateCustomerData("internet_service.bin");
    }

    public static void generateCustomerData(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {

            dos.writeUTF("Customer A");
            dos.writeDouble(50.0);
            dos.writeInt(4);

            dos.writeUTF("Customer B");
            dos.writeDouble(60.0);
            dos.writeInt(2);

            dos.writeUTF("Customer C");
            dos.writeDouble(70.0);
            dos.writeInt(5);

            System.out.println("Binary file amjilttai.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
