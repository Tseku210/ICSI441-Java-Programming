package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of applicants: ");
        int numApplicants = scanner.nextInt();

        for (int i = 0; i < numApplicants; i++) {
            System.out.println("\nApplicant " + (i + 1));

            double diplomaScore = generateRandomGPA(random);
            System.out.println("Diploma score: " + diplomaScore);

            int workExperience = generateRandomWorkExperience(random);
            System.out.println("Work experience (years): " + workExperience);

            double rating = calculateRating(diplomaScore, workExperience);
            System.out.println("Rating: " + rating);
        }

        scanner.close();
    }

    public static double generateRandomGPA(Random random) {
        double minGPA = 1.0;
        double maxGPA = 4.0;
        return minGPA + (maxGPA - minGPA) * random.nextDouble();
    }

    public static int generateRandomWorkExperience(Random random) {
        int minExperience = 0;
        int maxExperience = 5;
        return random.nextInt(maxExperience - minExperience + 1) + minExperience;
    }

    public static double calculateRating(double diplomaScore, int workExperience) {
        Function<Integer, Double> workCoefficient = (experience) -> {
            if (experience < 2) {
                return 13.0;
            } else if (experience >= 2 && experience <= 5) {
                return 16.0;
            } else {
                return 1.0;
            }
        };

        double coefficient = workCoefficient.apply(workExperience);
        return diplomaScore * coefficient;
    }
}
