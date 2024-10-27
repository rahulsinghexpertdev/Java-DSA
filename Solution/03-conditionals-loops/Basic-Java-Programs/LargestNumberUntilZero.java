//25. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestNumberUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer

        System.out.println("Enter integers (enter 0 to stop):");

        // Read inputs until the user enters 0
        int number;
        while (true) {
            number = scanner.nextInt(); // Get user input

            if (number == 0) { // Check for termination condition
                break;
            }

            // Update largest if the current number is greater
            if (number > largest) {
                largest = number;
            }
        }

        // Check if any number was entered
        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            // Display the result
            System.out.println("The largest number entered is: " + largest);
        }

        // Close the scanner
        scanner.close();
    }
}
