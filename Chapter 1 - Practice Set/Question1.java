// Question 1: Write a program to sum three numbers in Java.

import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :)");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :)");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number :)");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Sum is "+sum);

        sc.close();
    }
}