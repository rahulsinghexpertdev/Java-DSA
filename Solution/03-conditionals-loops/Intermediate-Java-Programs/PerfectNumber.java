//22. Perfect Number In Java

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect number
        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int num) {
        int sum = 0;

        // Find divisors and calculate their sum
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add the divisor
            }
        }

        return sum == num; // Check if the sum of divisors equals the number
    }
}
