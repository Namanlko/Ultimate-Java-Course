// Question 1: Write a java method to print the multiplication table of a number n.

import java.util.Scanner;

public class Question1{

    public static void Table(int n){
        System.out.println("Table of "+n+" Is:");
        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :)");
        int n = sc.nextInt();
        Table(n);
        sc.close();
    }
}