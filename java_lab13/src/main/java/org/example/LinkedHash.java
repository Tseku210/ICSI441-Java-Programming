package org.example;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class LinkedHash {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        Stream<String> newSet = set.stream().peek(System.out::println).map(String::toLowerCase);
        newSet.forEach(System.out::println);
    }

}
