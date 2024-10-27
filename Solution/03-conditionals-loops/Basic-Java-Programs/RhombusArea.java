//6. Area Of Rhombus

import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the lengths of the diagonals
        System.out.print("Enter the length of the first diagonal: ");
        double diagonal1 = scanner.nextDouble();

        System.out.print("Enter the length of the second diagonal: ");
        double diagonal2 = scanner.nextDouble();

        // Calculate the area
        double area = (diagonal1 * diagonal2) / 2;

        // Display the result
        System.out.println("The area of the rhombus is: " + area);

        // Close the scanner
        scanner.close();
    }
}
