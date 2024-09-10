// Question 1: Write a java program to convert a String to lowercase.

import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String!");
        String str = sc.next();
        sc.close();

        System.out.println("String is Lower Case is: "+str.toLowerCase());
    }
}