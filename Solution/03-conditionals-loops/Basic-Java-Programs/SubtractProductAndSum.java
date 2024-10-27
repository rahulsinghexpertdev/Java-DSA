//22. Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int product = 1;

        // Calculate sum and product of digits
        int temp = number; // Use a temporary variable to extract digits
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sum += digit;          // Add to sum
            product *= digit;      // Multiply to product
            temp /= 10;            // Remove the last digit
        }

        // Calculate the result
        int result = sum - product;

        // Display the result
        System.out.println("The result of subtracting the product from the sum of the digits is: " + result);

        // Close the scanner
        scanner.close();
    }
}
