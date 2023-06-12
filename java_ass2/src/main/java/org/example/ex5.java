package org.example;

import java.io.*;
import java.util.*;

public class ex5 {
    public ex5() throws IOException {
        File inputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/ex5.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        File outputFile = new File("/Users/tsenguunotgonbaatar/dev/java_programming/java_ass2/src/main/resources/output5.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        int[] counts = new int[26];
        int c;
        while ((c = reader.read()) != -1) {
            char ch = (char) c;
            if (Character.isLowerCase(ch)) {
                counts[ch - 'a']++;
            }
        }

        // sort
        List<String> result = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char ch = (char) ('a' + i);
//                result[i] = ch + "-" + counts[i];
                result.add(ch + "-" + counts[i]);
            }
        }
//        print(result);

        mergesort(result, 0, result.size() - 1);

        for (int i = 0; i < result.size(); i++) {
            writer.write(result.get(i) + "\n");
        }

        reader.close();
        writer.close();
    }

    private void mergesort(List<String> arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void print(List<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    private void merge(List<String> arr, int left, int mid, int right) {
        List<String> leftArr = new ArrayList<>(arr.subList(left, mid + 1));
        List<String> rightArr = new ArrayList<>(arr.subList(mid + 1, right + 1));
//        print(leftArr);
//        System.out.println("---");
//        print(rightArr);
        int i = 0, j = 0, k = left;
        while (i < leftArr.size() && j < rightArr.size()) {
            if (compare(leftArr.get(i), rightArr.get(j)) > 0) {
                arr.set(k++, leftArr.get(i++));
            } else {
                arr.set(k++, rightArr.get(j++));
            }
        }
        while (i < leftArr.size()) {
            arr.set(k++, leftArr.get(i++));
        }
        while (j < rightArr.size()) {
            arr.set(k++, rightArr.get(j++));
        }
    }

    private int compare(String s1, String s2) {
        int n1 = Integer.parseInt(s1.split("-")[1]);
        int n2 = Integer.parseInt(s2.split("-")[1]);
        if (n1 != n2) {
            return n2 - n1;
        }
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {
        try {
            new ex5();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
