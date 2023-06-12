package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Groupingby {
    List<Integer> list = Arrays.asList(1, 2, 3, 2, 4);

    public Groupingby() {
        list.stream()
                .collect(Collectors.groupingBy(value -> value % 2 == 0))
    }

    public static void main(String[] args) {
        new Groupingby();
    }
}
