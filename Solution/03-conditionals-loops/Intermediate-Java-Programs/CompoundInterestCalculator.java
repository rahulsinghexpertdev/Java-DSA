//11. Compound Interest Java Program

import java.util.Scanner;

public class CompoundInterestCalculator {
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

        // Prompt the user for the number of times interest is compounded per year
        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int timesCompounded = scanner.nextInt();

        // Prompt the user for the number of years
        System.out.print("Enter the number of years (t): ");
        int years = scanner.nextInt();

        // Calculate the amount after interest
        double amount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        // Calculate compound interest
        double compoundInterest = amount - principal;

        // Display the results
        System.out.printf("The compound interest is: $%.2f%n", compoundInterest);
        System.out.printf("The total amount after %.2f years is: $%.2f%n", (double) years, amount);

        // Close the scanner
        scanner.close();
    }
}
