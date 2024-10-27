//7. Power In Java

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for base and exponent
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate the power using Math.pow
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.printf("%.2f raised to the power of %.2f is: %.2f%n", base, exponent, result);

        // Close the scanner
        scanner.close();
    }
}