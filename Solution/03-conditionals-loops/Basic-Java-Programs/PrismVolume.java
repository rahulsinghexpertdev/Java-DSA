//15. Volume Of Prism

import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the dimensions of the prism
        System.out.print("Enter the length of the prism: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the prism: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the prism: ");
        double height = scanner.nextDouble();

        // Calculate the base area and volume
        double baseArea = length * width;
        double volume = baseArea * height;

        // Display the result
        System.out.println("The volume of the prism is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
