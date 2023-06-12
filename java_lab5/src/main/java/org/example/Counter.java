package org.example;

import java.io.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// write a program that prompts the user to enter a text file name and displays the number of vowels and consonants in the file. Use a set to store the vowels A, E, I, O, and U

public class Counter {

    public static void main(String[] args) throws IOException {
        TreeMap<Character, Integer> hash = new TreeMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            hash.put(c, 0);
        }

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        Scanner in = new Scanner(System.in);

        String filename = in.nextLine();

        File file = new File(
                "/Users/tsenguunotgonbaatar/dev/java_programming/java_lab5/src/main/resources/"
                        + filename);



        BufferedReader reader = new BufferedReader(new FileReader(file));

        int c;
        while ((c = reader.read()) != -1) {
            char ch = (char) c;
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                if (vowels.contains(ch)) {
                    hash.put(ch, hash.get(ch) + 1);
                } else {
                    hash.put(ch, hash.get(ch) + 1);
                }
            }
        }

        int consCount = 0;
        int vowCount = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int count = hash.get(ch);
            if (vowels.contains(ch)) {
                vowCount += count;
            } else {
                consCount += count;
            }
        }

        for (Map.Entry<Character, Integer> entry: hash.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        System.out.println("Giiguulegch too: " + consCount);
        System.out.println("Egshig too: " + vowCount);

    }
}
