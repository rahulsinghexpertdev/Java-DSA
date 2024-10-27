//12. Perimeter Of Square

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length of a side
        System.out.print("Enter the length of a side of the square: ");
        double side = scanner.nextDouble();

        // Calculate the perimeter
        double perimeter = 4 * side;

        // Display the result
        System.out.println("The perimeter of the square is: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
