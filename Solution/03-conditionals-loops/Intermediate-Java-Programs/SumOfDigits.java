//24. Sum Of A Digits Of Number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = sumOfDigits(number);

        // Display the result
        System.out.println("The sum of the digits of " + number + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;

        // Handle negative numbers
        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10;       // Remove the last digit
        }

        return sum;
    }
}
