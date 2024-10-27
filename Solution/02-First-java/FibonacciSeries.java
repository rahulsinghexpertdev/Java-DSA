//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of terms
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        // Print Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacci(n);

        scanner.close();
    }

    // Method to print Fibonacci series
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}
