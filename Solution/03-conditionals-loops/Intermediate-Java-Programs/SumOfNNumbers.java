//13. Sum Of N Numbers

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of integers to sum
        System.out.print("Enter the number of integers you want to sum: ");
        int n = scanner.nextInt();

        // Initialize the sum variable
        int sum = 0;

        // Loop to input N numbers
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number; // Add the number to the sum
        }

        // Display the result
        System.out.println("The sum of the entered numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
