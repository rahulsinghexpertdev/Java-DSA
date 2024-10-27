//Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        // Conversion rate from INR to USD
        final double conversionRate = 84.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in Indian Rupees (INR): ");
        double amountInRupees = scanner.nextDouble();

        double amountInUSD = amountInRupees / conversionRate;

        System.out.printf("Amount in US Dollars (USD): %.2f\n", amountInUSD);

        scanner.close();
    }
}
