//4. Area Of Isosceles Triangle

import java.util.Scanner;

public class IsoscelesTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for base and height
        System.out.print("Enter the base of the isosceles triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the isosceles triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area
        double area = (base * height) / 2;

        // Display the result
        System.out.println("The area of the isosceles triangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
