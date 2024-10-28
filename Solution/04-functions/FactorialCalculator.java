//9. Write a program to print the factorial of a number by defining a method named 'Factorial'

import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate the factorial of a number
    public static long Factorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply each number up to 'number'
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        // Calculate and display the factorial
        long result = Factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);

        scanner.close();
    }
}
