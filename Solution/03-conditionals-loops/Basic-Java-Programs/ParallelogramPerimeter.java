//10. Perimeter Of Parallelogram

import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the lengths of the base and height
        System.out.print("Enter the length of the base of the parallelogram: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the length of the side (height) of the parallelogram: ");
        double height = scanner.nextDouble();

        // Calculate the perimeter
        double perimeter = 2 * (base + height);

        // Display the result
        System.out.println("The perimeter of the parallelogram is: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
