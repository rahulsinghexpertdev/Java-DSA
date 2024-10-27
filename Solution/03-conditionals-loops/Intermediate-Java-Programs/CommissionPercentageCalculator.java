//6. Calculate Commission Percentage

import java.util.Scanner;

public class CommissionPercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for total sales amount
        System.out.print("Enter the total sales amount: ");
        double totalSales = scanner.nextDouble();

        // Prompt the user for commission earned
        System.out.print("Enter the commission earned: ");
        double commissionEarned = scanner.nextDouble();

        // Calculate commission percentage
        if (totalSales > 0) {
            double commissionPercentage = (commissionEarned / totalSales) * 100;

            // Display the result
            System.out.printf("The commission percentage is: %.2f%%\n", commissionPercentage);
        } else {
            System.out.println("Total sales must be greater than zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
