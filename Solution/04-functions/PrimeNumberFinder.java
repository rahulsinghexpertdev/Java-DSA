//13. Write a function that returns all prime numbers between two given numbers.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberFinder {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // The number is prime
    }

    // Method to find all prime numbers between two given numbers
    public static List<Integer> findPrimesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Find and display all prime numbers in the range
        List<Integer> primes = findPrimesInRange(start, end);
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);

        scanner.close();
    }
}
