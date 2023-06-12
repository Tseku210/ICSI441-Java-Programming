package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Votes {
    private static double costPerVote = 20000;
    private static int favCand;
    public static void main(String[] args) {
        ArrayList<Integer> votes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            votes.add((int) (Math.random() * 21));
        }
        for (int i = 0; i < votes.size(); i++) {
            System.out.println(i+1 + "-р дэвшигч: " + votes.get(i));
        }
        System.out.println("Таны дэмжиж буй нэр дэвшигч: ");
        Scanner in = new Scanner(System.in);
        favCand = in.nextInt() - 1;
        double cost = calculateCost(votes);
        System.out.println("Таны дэмжиж буй нэр дэвшигч ялахын тулд " + cost + " төгрөг хэрэгтэй");
    }

    public static double calculateCost(ArrayList<Integer> votes) {
        int maxVotes = Collections.max(votes);
        if (votes.get(favCand) + 1 > maxVotes) {
            return 0;
        }

        int diff = maxVotes - votes.get(favCand) + 1;
        return diff * costPerVote;
    }
}
