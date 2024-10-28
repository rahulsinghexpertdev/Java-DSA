//1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaxMinFinder {

    // Method to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Method to find the minimum of three numbers
    public static int findMinimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter three numbers:");

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();

        // Call the methods and display the results
        int max = findMaximum(num1, num2, num3);
        int min = findMinimum(num1, num2, num3);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}
