//12. Calculate Average Marks

import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double totalMarks = 0;

        // Loop to input marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks; // Add marks to total
        }

        // Calculate average marks
        if (numberOfSubjects > 0) {
            double averageMarks = totalMarks / numberOfSubjects;
            // Display the result
            System.out.printf("The average marks are: %.2f%n", averageMarks);
        } else {
            System.out.println("Number of subjects must be greater than zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
