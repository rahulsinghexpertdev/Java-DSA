//19. Curved Surface Area Of Cylinder

import java.util.Scanner;

public class CylinderCurvedSurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius and height
        System.out.print("Enter the radius of the base of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the curved surface area
        double curvedSurfaceArea = 2 * Math.PI * radius * height;

        // Display the result
        System.out.println("The curved surface area of the cylinder is: " + curvedSurfaceArea);

        // Close the scanner
        scanner.close();
    }
}
