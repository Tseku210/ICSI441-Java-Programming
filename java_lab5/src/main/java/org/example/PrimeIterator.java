package org.example;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class PrimeIterator implements Iterable<Integer> {
    private int limit;

    public PrimeIterator(int limit) {
        this.limit = limit;
    }

    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num + 1; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        int current = 2;


        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
