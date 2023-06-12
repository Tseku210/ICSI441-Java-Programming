package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    Set<String> set;
    public TestTreeSet() {
        set = new HashSet<>(Arrays.asList("London", "Paris", "New York", "San Francisco", "Beijing", "New York"));
        TreeSet<String> treeSet = new TreeSet<>();
        set.stream().peek(System.out::println);
    }

    public static void main(String[] args) {
        new TestTreeSet();
    }
}
