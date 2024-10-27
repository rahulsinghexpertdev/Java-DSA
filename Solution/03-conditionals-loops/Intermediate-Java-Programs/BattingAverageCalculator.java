//9. Calculate Batting Average

import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for total runs scored and total times at bat
        System.out.print("Enter the total runs scored: ");
        double totalRuns = scanner.nextDouble();

        System.out.print("Enter the total times at bat: ");
        int totalAtBat = scanner.nextInt();

        // Calculate batting average
        if (totalAtBat > 0) {
            double battingAverage = totalRuns / totalAtBat;

            // Display the result
            System.out.printf("The batting average is: %.2f%n", battingAverage);
        } else {
            System.out.println("Total times at bat must be greater than zero.");
        }

        // Close the scanner
        scanner.close();
    }
}