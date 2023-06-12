package org.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem6 {
    public static void main(String[] args) {
        List<River> rivers = readRiversFromFile("rivers.bin");

        int totalLengthOfShallowRivers = calculateTotalLengthOfShallowRivers(rivers, 50);
        System.out.println("50m ees baga guntei buh goliin urt: " + totalLengthOfShallowRivers + " km");

        River shortestRiver = findShortestRiver(rivers);
        System.out.println("Bogino gol: " + shortestRiver.getName());

        River shallowestRiver = findShallowestRiver(rivers);
        System.out.println("Guehen gol: " + shallowestRiver.getName());
    }

    public static List<River> readRiversFromFile(String fileName) {
        List<River> rivers = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int length = dis.readInt();
                int averageDepth = dis.readInt();

                rivers.add(new River(name, length, averageDepth));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rivers;
    }

    public static int calculateTotalLengthOfShallowRivers(List<River> rivers, int depthThreshold) {
        return rivers.stream()
                .filter(river -> river.getAverageDepth() < depthThreshold)
                .mapToInt(River::getLength)
                .sum();
    }

    public static River findShortestRiver(List<River> rivers) {
        return rivers.stream()
                .min(Comparator.comparingInt(River::getLength))
                .orElse(null);
    }

    public static River findShallowestRiver(List<River> rivers) {
        return rivers.stream()
                .min(Comparator.comparingInt(River::getAverageDepth))
                .orElse(null);
    }
}
