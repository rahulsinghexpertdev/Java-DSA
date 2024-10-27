//17. Volume Of Sphere

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the volume
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        // Display the result
        System.out.println("The volume of the sphere is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
