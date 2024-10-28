//2. Define a program to find out whether a given number is even or odd

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        result(num);
    }

    public static void result(int input){
        if(input%2==0){
            System.out.println("Even");
        } else System.out.println("odd");
    }
}