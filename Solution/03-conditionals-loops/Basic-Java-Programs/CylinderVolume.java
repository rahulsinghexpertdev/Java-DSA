//16. Volume Of Cylinder

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius and height
        System.out.print("Enter the radius of the base of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Display the result
        System.out.println("The volume of the cylinder is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
