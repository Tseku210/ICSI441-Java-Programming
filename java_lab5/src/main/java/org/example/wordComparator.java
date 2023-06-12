package org.example;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class wordComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return 0;
    }

    @Override
    public Comparator<String> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<String> thenComparing(Comparator<? super String> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<String> thenComparing(Function<? super String, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<String> thenComparing(Function<? super String, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<String> thenComparingInt(ToIntFunction<? super String> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<String> thenComparingLong(ToLongFunction<? super String> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<String> thenComparingDouble(ToDoubleFunction<? super String> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
