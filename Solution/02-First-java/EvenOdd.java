//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");

        scanner.close();
    }
}