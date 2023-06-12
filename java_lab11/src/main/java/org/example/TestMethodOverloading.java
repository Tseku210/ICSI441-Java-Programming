package org.example;

@FunctionalInterface
interface GetMax<T> {
    T max(T num1, T num2);
}

interface Get3Max<T> {
    T max(T num1, T num2, T num3);
}

public class TestMethodOverloading {

    GetMax<Integer> getIntMax;
    GetMax<Double> getDoubleMax;
    Get3Max<Integer> get3Max;

    public TestMethodOverloading() {
        getIntMax = (n1, n2) -> n1 > n2 ? n1 : n2;

        getDoubleMax = (n1, n2) -> n1 > n2 ? n1 : n2;

        get3Max = (n1, n2, n3) -> {
            if (n1 > n2 && n1 > n3) {
                return n1;
            } else if (n2 > n1 && n2 > n3) {
                return n2;
            } else {
                return n3;
            }
        };


        System.out.println(getIntMax.max(2, 1));
        System.out.println(getDoubleMax.max(5.5, 6.6));
        System.out.println(get3Max.max(4, 2, 8));
    }

    public static void main(String[] args) {
        new TestMethodOverloading();
    }
}
