//12. Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;

public class PythagoreanTripletChecker {

    // Method to check if a triplet is a Pythagorean triplet
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Check if any permutation of the triplet satisfies the Pythagorean theorem
        return (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        // Check if the triplet is a Pythagorean triplet and display the result
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        } else {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        }

        scanner.close();
    }
}
