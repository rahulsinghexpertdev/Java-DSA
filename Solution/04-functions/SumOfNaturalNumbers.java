//14. Write a function that returns the sum of first n natural numbers

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of the first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2; // Formula for the sum of the first n natural numbers
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Calculate and display the sum
        if (n > 0) {
            int sum = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}
