//4. Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(additionOfTwo(a, b));
    }
    public static int additionOfTwo(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}