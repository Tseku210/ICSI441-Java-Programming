package org.example;

import java.util.*;

// holboost jagsaaltad toonuud hadgal
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Scanner in = new Scanner(System.in);
        while (list.size() < 5) {
            int el = in.nextInt();
            if (!list.contains(el)) {
                list.add(el);
            } else {
                System.out.println("Davhtsaj baina");
            }
        }

        // sort, shuffle, reverse
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println("after sort");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer el: list) {
            System.out.print(el + " ");
        }

        System.out.println("\nafter shuffle");

        Collections.shuffle(list);

        for (Integer el: list) {
            System.out.print(el + " ");
        }

        System.out.println("\nafter reverse");

        Collections.reverse(list);

        for (Integer el: list) {
            System.out.print(el + " ");
        }
    }
}