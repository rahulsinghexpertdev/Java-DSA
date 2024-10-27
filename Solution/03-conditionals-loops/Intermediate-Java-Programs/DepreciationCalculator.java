//8. Calculate Depreciation of Value

import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the initial value, salvage value, and useful life
        System.out.print("Enter the initial value of the asset: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter the salvage value of the asset: ");
        double salvageValue = scanner.nextDouble();

        System.out.print("Enter the useful life of the asset (in years): ");
        int usefulLife = scanner.nextInt();

        // Calculate the annual depreciation expense
        if (usefulLife > 0) {
            double depreciationExpense = (initialValue - salvageValue) / usefulLife;

            // Display the result
            System.out.printf("The annual depreciation expense is: $%.2f%n", depreciationExpense);
        } else {
            System.out.println("Useful life must be greater than zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
