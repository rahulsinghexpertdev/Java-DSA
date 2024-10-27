//7. Area Of Equilateral Triangle

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length of a side
        System.out.print("Enter the length of a side of the equilateral triangle: ");
        double side = scanner.nextDouble();

        // Calculate the area
        double area = (Math.sqrt(3) / 4) * (side * side);

        // Display the result
        System.out.println("The area of the equilateral triangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
