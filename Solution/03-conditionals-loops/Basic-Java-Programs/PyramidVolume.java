//18. Volume Of Pyramid

import java.util.Scanner;

public class PyramidVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the dimensions of the pyramid
        System.out.print("Enter the length of the base of the pyramid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the base of the pyramid: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the pyramid: ");
        double height = scanner.nextDouble();

        // Calculate the base area and volume
        double baseArea = length * width;
        double volume = (1.0 / 3) * baseArea * height;

        // Display the result
        System.out.println("The volume of the pyramid is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
