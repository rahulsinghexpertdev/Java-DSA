//10. Write a function to find if a number is a palindrome or not. Take number as parameter

import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a palindrome and display the result
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }
}
