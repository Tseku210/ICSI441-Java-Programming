package org.example;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(1 / x);
    }

    public static void main(String[] args) {
        Stream.of(1.0, 2.0, 3.0, 4.0, 5.0, 0.0)
                .map(Main::inverse)
                .forEach(res -> res.ifPresent(System.out::println));

    }
}