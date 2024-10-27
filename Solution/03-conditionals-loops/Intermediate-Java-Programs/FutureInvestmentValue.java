//18. Future Investment Value

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the principal amount
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Prompt the user for the annual interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualRate = scanner.nextDouble();

        // Convert percentage to decimal
        double rate = annualRate / 100;

        // Prompt the user for the number of years
        System.out.print("Enter the number of years (n): ");
        int years = scanner.nextInt();

        // Calculate future value
        double futureValue = principal * Math.pow(1 + rate, years);

        // Display the result
        System.out.printf("The future investment value is: $%.2f%n", futureValue);

        // Close the scanner
        scanner.close();
    }
}
