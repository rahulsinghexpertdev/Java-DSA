//20. Total Surface Area Of Cube

import java.util.Scanner;

public class CubeSurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length of a side
        System.out.print("Enter the length of a side of the cube: ");
        double side = scanner.nextDouble();

        // Calculate the total surface area
        double surfaceArea = 6 * Math.pow(side, 2);

        // Display the result
        System.out.println("The total surface area of the cube is: " + surfaceArea);

        // Close the scanner
        scanner.close();
    }
}
