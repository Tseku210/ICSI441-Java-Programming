package org.example;

import java.util.Scanner;

public class QuadraticEquations {

    // garnaas oguulber oruulna, ugen dotor baigaa tom usgiin too jijig usgiin toog todorhoil


    // psvm emmet ashiglan main function gargana
    public static void main(String[] args) {
        // new bodlogo

//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine();
//        int i = 0;
//        int bigChar = 0, smallChar = 0;
//        while (i < str.length()) {
//            if (Character.isLetter(str.charAt(i))) {
//                String s = "" + str.charAt(i);
//                if (s == s.toUpperCase()) bigChar++;
//                else smallChar++;
//            }
//            i++;
//        }
//
//        System.out.println("big: " + bigChar + " small: " + smallChar);

        // end of new bodlogo


        // new bodlogo
        Scanner input = new Scanner(System.in);
        String str;
        System.out.println("Provide string");
        str = input.nextLine();
        System.out.println(str);
        int p1 = 0, p2 = str.length()-1;
        while (p1 < p2) {
            if (str.charAt(p1) != str.charAt(p2)) {
                System.out.println("Palindrome bish");
                System.exit(1);
            }
            p1++;
            p2--;
        }

        System.out.println("Palindrome mun");
        System.exit(0);

        // another

//        int checksum = 0;
//        for (int i = 0; i < str.length(); i++) {
//            checksum += Character.getNumericValue(str.charAt(i)) * (i+1);
//        }
//        checksum = checksum % 11;
//
//        if (checksum == 10) {
//            str += "X";
//        } else {
//            str += checksum;
//        }
//
//        System.out.println(str);

        // end of new bodlogo

//
//        double a, b, c, x1, x2;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("a, b, c = ");
//        a = input.nextDouble();
//        b = input.nextDouble();
//        c = input.nextDouble();
//
//        System.out.println(a + ", " + b + ", " + c);
//
//        // Logic
//        double d = b*b - 4*a*c;
//        if (d > 0) {
//            System.out.println("2 shiidtei");
//            x1 = (-b + Math.sqrt(d)) / (2*a);
//            x2 = (-b - Math.sqrt(d)) / (2*a);
//            System.out.println("x1: " + x1 + " x2: " + x2);
//        } else if (d == 0) {
//            System.out.println("1 shiidtei");
//            x1 = -b / (2*a);
//            System.out.println("x1: " + x1);
//        } else {
//            System.out.println("Shiidgui");
//        }
    }
}
