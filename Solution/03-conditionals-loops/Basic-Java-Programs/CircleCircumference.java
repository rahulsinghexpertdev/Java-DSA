//8. Perimeter Of Circle

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the circumference
        double circumference = 2 * Math.PI * radius;

        // Display the result
        System.out.println("The circumference of the circle is: " + circumference);

        // Close the scanner
        scanner.close();
    }
}
