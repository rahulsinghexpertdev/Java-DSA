//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time (T) in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R): ");
        double rate = scanner.nextDouble();

        // Calculate Simple Interest using the formula: SI = (P * T * R) / 100
        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);

        scanner.close();
    }
}
