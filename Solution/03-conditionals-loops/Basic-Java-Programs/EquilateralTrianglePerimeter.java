//9. Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class EquilateralTrianglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length of a side
        System.out.print("Enter the length of a side of the equilateral triangle: ");
        double side = scanner.nextDouble();

        // Calculate the perimeter
        double perimeter = 3 * side;

        // Display the result
        System.out.println("The perimeter of the equilateral triangle is: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
