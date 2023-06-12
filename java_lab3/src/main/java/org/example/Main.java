package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
//        ArrayList<GeometricObject> objs = new ArrayList<>(5);
//        Square sq1 = new Square(1);
//        Triangle t1 = new Triangle(1, 1, 1, "black", false);
//        Square sq2 = new Square(3);
//        Triangle t2 = new Triangle(2, 2, 2, "white", true);
//        Square sq3 = new Square(10);
//
//        objs.add(sq1);
//        objs.add(t1);
//        objs.add(sq2);
//        objs.add(t2);
//        objs.add(sq3);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(objs.get(i).getArea());
//            if (objs.get(i) instanceof Colorable) {
//                System.out.println(((Square) objs.get(i)).howToColor());
//            }
//        }

        // 13.11 дасгал

        Octagon oct = new Octagon(5);
        Octagon octClone = oct.clone();
        System.out.println(oct.compareTo(octClone));
        System.out.println(oct);
        System.out.println(octClone);
    }
}