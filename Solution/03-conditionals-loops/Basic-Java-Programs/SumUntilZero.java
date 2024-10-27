//24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Initialize sum

        System.out.println("Enter integers to sum (enter 0 to stop):");

        // Read inputs until the user enters 0
        int number;
        while (true) {
            number = scanner.nextInt(); // Get user input

            if (number == 0) { // Check for termination condition
                break;
            }

            sum += number; // Add to sum
        }

        // Display the result
        System.out.println("The sum of all entered numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
