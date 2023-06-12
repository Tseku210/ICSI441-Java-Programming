package org.example;

@FunctionalInterface
interface MyIncrement {
    void increment(int n);
}

public class Increment {

    MyIncrement increment = (n) -> System.out.println("Incremented to " + ++n);

    public Increment(int n) {
        increment.increment(n);
    }
    public static void main(String[] args) {
        new Increment(10);
    }
}
