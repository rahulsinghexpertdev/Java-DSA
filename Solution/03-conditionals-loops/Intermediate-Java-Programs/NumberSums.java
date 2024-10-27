//26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class NumberSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (enter 0 to terminate):");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Terminate the loop when user enters zero
            }

            // Calculate sums based on the number type
            if (number < 0) {
                sumNegative += number; // Sum of negative numbers
            } else if (number % 2 == 0) {
                sumPositiveEven += number; // Sum of positive even numbers
            } else {
                sumPositiveOdd += number; // Sum of positive odd numbers
            }
        }

        // Display the results
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        // Close the scanner
        scanner.close();
    }
}
