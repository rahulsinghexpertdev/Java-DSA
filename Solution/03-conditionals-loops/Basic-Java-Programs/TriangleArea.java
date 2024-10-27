//2. Area Of Triangle

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area
        double area = calculateArea(base, height);

        // Output: Area of the triangle
        System.out.printf("The area of the triangle with base %.2f and height %.2f is: %.2f%n", base, height, area);

        scanner.close();
    }

    // Method to calculate area of triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}
