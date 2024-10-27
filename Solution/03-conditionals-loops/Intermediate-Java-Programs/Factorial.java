//1. Factorial Program In Java

import java.util.Scanner;

public class Factorial {
    // Method to calculate factorial iteratively
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial recursively
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1; // Base case
        } else {
            return n * factorialRecursive(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Ensure the input is non-negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using both methods
            long iterativeResult = factorialIterative(number);
            long recursiveResult = factorialRecursive(number);

            // Display the results
            System.out.println("Factorial of " + number + " (iterative): " + iterativeResult);
            System.out.println("Factorial of " + number + " (recursive): " + recursiveResult);
        }

        // Close the scanner
        scanner.close();
    }
}
