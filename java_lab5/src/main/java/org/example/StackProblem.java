package org.example;

import java.util.*;

public class StackProblem {
    public static void main(String[] args) {
        String[] arr1 = {"Chemistry", "Mathematics", "Biology", "English"};
        String[] arr2 = {"Biology", "English", "Geography", "Physics"};
        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();

        s1.addAll(Arrays.asList(arr1));
        s2.addAll(Arrays.asList(arr2));

        Iterator<String> iterator = s1.iterator();
        HashSet<String> res = new HashSet<>();
        while (iterator.hasNext()) {
            String el = iterator.next();
            if (!s2.contains(el)) {
                res.add(el);
            }
        }

        for (String el: res) {
            System.out.print(el + " ");
        }
    }
}
