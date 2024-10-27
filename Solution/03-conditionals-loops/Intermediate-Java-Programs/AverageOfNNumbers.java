//3. Calculate Average Of N Numbers

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize variables for sum and average
        double sum = 0;

        // Loop to read N numbers and calculate the sum
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number; // Add to sum
        }

        // Calculate the average
        double average = sum / n;

        // Display the result
        System.out.printf("The average of the entered numbers is: %.2f%n", average);

        // Close the scanner
        scanner.close();
    }
}
