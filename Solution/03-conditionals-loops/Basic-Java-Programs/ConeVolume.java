//14. Volume Of Cone Java Program

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius and height
        System.out.print("Enter the radius of the base of the cone: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cone: ");
        double height = scanner.nextDouble();

        // Calculate the volume
        double volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;

        // Display the result
        System.out.println("The volume of the cone is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
