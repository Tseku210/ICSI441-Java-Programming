package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LastWordOfShortestString {

    File file;

    public LastWordOfShortestString() throws FileNotFoundException {
        file = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_lab2/class_lab2/src/main/resources/firstFile.txt");
        Scanner input = new Scanner(file);
        String[] oguulber;
        StringBuilder text = new StringBuilder("");

        while (input.hasNextLine()) {
            text.append(input.nextLine());
        }

        oguulber = text.toString().split("\\.");

        String shortest = oguulber[0];
        for (int i = 1; i < oguulber.length; i++) {
            if (oguulber[i].length() < shortest.length()) {
                shortest = oguulber[i];
            }
        }

        String[] shortWords = shortest.split(" ");

        System.out.println(shortWords[shortWords.length - 1]);
    }

    public static void main(String[] args) throws Exception {
        try {
            new LastWordOfShortestString();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
