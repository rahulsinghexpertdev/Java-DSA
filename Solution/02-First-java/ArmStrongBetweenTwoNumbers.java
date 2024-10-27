//To find Armstrong Number between two given number.

import java.util.Scanner;

public class ArmStrongBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range
        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        // Find and print Armstrong numbers
        for (int num = lower; num <= upper; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
