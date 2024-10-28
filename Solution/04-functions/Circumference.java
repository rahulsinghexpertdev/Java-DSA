//6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        circumferenceOfCircle(radius);
    }

    public static void circumferenceOfCircle(double radius){
        double result = 2 * 3.14 * radius;
        System.out.println(result);
    }
}