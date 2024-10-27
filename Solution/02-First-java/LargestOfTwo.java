//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

class LargestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("LargestOfTwo: " + num1);
        } else System.out.println("LargestOfTwo: " + num2);

        scanner.close();
    }
}