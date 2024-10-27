//15. Find Ncr & Npr

import java.util.Scanner;

public class NCrNPRCalculator {

    // Method to calculate factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for values of N and R
        System.out.print("Enter value for N: ");
        int N = scanner.nextInt();

        System.out.print("Enter value for R: ");
        int R = scanner.nextInt();

        // Check if R is greater than N
        if (R > N) {
            System.out.println("R cannot be greater than N.");
        } else {
            // Calculate NCr and NPR
            long nCr = factorial(N) / (factorial(R) * factorial(N - R));
            long nPr = factorial(N) / factorial(N - R);

            // Display the results
            System.out.println("NCr (Combinations) = " + nCr);
            System.out.println("NPR (Permutations) = " + nPr);
        }

        // Close the scanner
        scanner.close();
    }
}
