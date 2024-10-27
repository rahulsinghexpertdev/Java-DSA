//21. Java Program Vowel Or Consonant

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); // Read the first character

        // Convert to lowercase for easier comparison
        char lowerChar = Character.toLowerCase(character);

        // Check if the character is a vowel or consonant
        if (Character.isLetter(lowerChar)) {
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                System.out.println(character + " is a vowel.");
            } else {
                System.out.println(character + " is a consonant.");
            }
        } else {
            System.out.println(character + " is not an alphabetic character.");
        }

        // Close the scanner
        scanner.close();
    }
}
