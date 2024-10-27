//13. Perimeter Of Rhombus

import java.util.Scanner;

public class RhombusPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length of a side
        System.out.print("Enter the length of a side of the rhombus: ");
        double side = scanner.nextDouble();

        // Calculate the perimeter
        double perimeter = 4 * side;

        // Display the result
        System.out.println("The perimeter of the rhombus is: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
