//4. Calculate Discount Of Product

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the original price and discount percentage
        System.out.print("Enter the original price of the product: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Calculate the discount amount
        double discountAmount = (discountPercentage / 100) * originalPrice;

        // Calculate the final price after discount
        double finalPrice = originalPrice - discountAmount;

        // Display the results
        System.out.printf("Discount Amount: $%.2f%n", discountAmount);
        System.out.printf("Final Price after discount: $%.2f%n", finalPrice);

        // Close the scanner
        scanner.close();
    }
}
