//21. Fibonacci Series In Java Programs

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Initialize the first two terms
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Generate the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;  // Calculate the next term
            a = b;                 // Update 'a' to the next term
            b = nextTerm;          // Update 'b' to the next term
        }

        // Close the scanner
        scanner.close();
    }
}
