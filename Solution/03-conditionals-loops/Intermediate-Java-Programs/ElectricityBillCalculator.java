//2. Calculate Electricity Bill

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of units consumed
        System.out.print("Enter the number of units consumed (in kWh): ");
        double units = scanner.nextDouble();

        // Define the rate per unit (you can modify this as needed)
        double ratePerUnit = 0.15; // Example rate: $0.15 per kWh

        // Calculate the total bill
        double billAmount = units * ratePerUnit;

        // Display the result
        System.out.printf("The total electricity bill is: $%.2f%n", billAmount);

        // Close the scanner
        scanner.close();
    }
}
