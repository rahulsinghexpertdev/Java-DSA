//20. LCM Of Two Numbers

import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF
        int hcf = calculateHCF(num1, num2);

        // Calculate LCM using the formula
        int lcm = Math.abs(num1 * num2) / hcf;

        // Display the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate HCF
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
