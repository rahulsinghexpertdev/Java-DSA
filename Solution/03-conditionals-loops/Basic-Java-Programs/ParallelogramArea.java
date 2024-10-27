//5. Area Of Parallelogram

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for base and height
        System.out.print("Enter the base of the parallelogram: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the parallelogram: ");
        double height = scanner.nextDouble();

        // Calculate the area
        double area = base * height;

        // Display the result
        System.out.println("The area of the parallelogram is: " + area);

        // Close the scanner
        scanner.close();
    }
}
