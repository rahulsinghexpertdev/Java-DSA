//5. Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(productOfTwo(a, b));
    }
    public static int productOfTwo(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }
}