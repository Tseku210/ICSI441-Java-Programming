package org.example;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Commanduud oruulna uu: ");
        String commands = scanner.nextLine();

        char finalDirection = calculateFinalDirection(commands);
        System.out.println("Final direction: " + finalDirection);

        scanner.close();
    }

    public static char calculateFinalDirection(String commands) {
        char initialDirection = 'X';

        BiFunction<Character, Integer, Character> updateDirection = (currentDirection, command) -> {
            if (command == 1) {
                return turnRight(currentDirection);
            } else if (command == -1) {
                return turnLeft(currentDirection);
            } else if (command == 2) {
                return turnOpposite(currentDirection);
            } else {
                return currentDirection;
            }
        };

        char finalDirection = initialDirection;
        for (int i = 0; i < commands.length(); i++) {
            int command = Integer.parseInt(String.valueOf(commands.charAt(i)));
            finalDirection = updateDirection.apply(finalDirection, command);
        }

        return finalDirection;
    }

    public static char turnRight(char currentDirection) {
        switch (currentDirection) {
            case 'X':
                return 'B';
            case 'U':
                return 'Z';
            case 'B':
                return 'U';
            case 'Z':
                return 'X';
            default:
                return currentDirection;
        }
    }

    public static char turnLeft(char currentDirection) {
        switch (currentDirection) {
            case 'X':
                return 'Z';
            case 'U':
                return 'B';
            case 'B':
                return 'X';
            case 'Z':
                return 'U';
            default:
                return currentDirection;
        }
    }

    public static char turnOpposite(char currentDirection) {
        switch (currentDirection) {
            case 'X':
                return 'U';
            case 'U':
                return 'X';
            case 'B':
                return 'Z';
            case 'Z':
                return 'B';
            default:
                return currentDirection;
        }
    }
}
