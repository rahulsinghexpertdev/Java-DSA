//8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class GradeCalculator {

    // Method to determine and display the grade based on marks
    public static String calculateGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        } else if (marks >= 51 && marks <= 60) {
            return "CD";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else if (marks <= 40) {
            return "Fail";
        } else {
            return "Invalid marks. Please enter a value between 0 and 100.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their marks
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        // Calculate and display the grade
        String grade = calculateGrade(marks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
