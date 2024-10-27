//19. HCF Of Two Numbers Program

import java.util.Scanner;

public class HCFCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF using the Euclidean algorithm
        int hcf = calculateHCF(num1, num2);

        // Display the result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

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
