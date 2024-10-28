//3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        eligibleForVoting(age);
    }

    public static void eligibleForVoting(int age){
        if(age>=18){
            System.out.println("Eligible");
        } else System.out.println("Not eligible");
    }
}