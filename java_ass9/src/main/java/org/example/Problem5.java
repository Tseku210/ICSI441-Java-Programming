package org.example;

public class Problem5 {
    public static void main(String[] args) {
        int totalCount = countLuckyTickets(13);
        System.out.println("Niilber ni 13 baih aztai tasalbariin too: " + totalCount);
    }

    public static int countLuckyTickets(int targetSum) {
        int count = 0;

        for (int ticketNumber = 0; ticketNumber <= 999999; ticketNumber++) {
            int sumFirstThreeDigits = calculateDigitSum(getFirstThreeDigits(ticketNumber));
            int sumLastThreeDigits = calculateDigitSum(getLastThreeDigits(ticketNumber));

            if (sumFirstThreeDigits == targetSum && sumLastThreeDigits == targetSum) {
                count++;
            }
        }

        return count;
    }

    public static int[] getFirstThreeDigits(int ticketNumber) {
        int[] digits = new int[3];

        digits[0] = (ticketNumber / 100000) % 10;
        digits[1] = (ticketNumber / 10000) % 10;
        digits[2] = (ticketNumber / 1000) % 10;

        return digits;
    }

    public static int[] getLastThreeDigits(int ticketNumber) {
        int[] digits = new int[3];

        digits[0] = (ticketNumber / 100) % 10;
        digits[1] = (ticketNumber / 10) % 10;
        digits[2] = ticketNumber % 10;

        return digits;
    }

    public static int calculateDigitSum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}
