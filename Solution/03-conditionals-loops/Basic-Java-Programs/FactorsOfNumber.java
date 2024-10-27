//23. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Loop to find and print factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor
                System.out.print(i + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
