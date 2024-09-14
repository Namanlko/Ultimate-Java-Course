// Question 3: Write a program to print multiplication table of a given number.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :)");
        int n = sc.nextInt();

        System.out.println("Table of "+n+" is :");
        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
        sc.close();
    }
}
