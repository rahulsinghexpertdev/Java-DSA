//1. Area Of Circle Java Program

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area
        double area = calculateArea(radius);

        // Output: Area of the circle
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);

        scanner.close();
    }

    // Method to calculate area of circle
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
