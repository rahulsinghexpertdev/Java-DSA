//10. Calculate CGPA Java Program

import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double totalGradePoints = 0;
        double totalCredits = 0;

        // Loop to input grade points and credit hours for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter grade points for subject " + i + ": ");
            double gradePoints = scanner.nextDouble();

            System.out.print("Enter credit hours for subject " + i + ": ");
            double credits = scanner.nextDouble();

            // Calculate total grade points and total credits
            totalGradePoints += gradePoints * credits;
            totalCredits += credits;
        }

        // Calculate CGPA
        if (totalCredits > 0) {
            double cgpa = totalGradePoints / totalCredits;

            // Display the result
            System.out.printf("The CGPA is: %.2f%n", cgpa);
        } else {
            System.out.println("Total credit hours must be greater than zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
