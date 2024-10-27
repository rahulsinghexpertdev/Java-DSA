//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        System.out.println("Greeting" + ": " + input);
    }
}