// Exercise 1: Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard (Marks are out of 100)

import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Subject Marks :)");
        int s1 = sc.nextInt();

        System.out.println("Enter Second Subject Marks :)");
        int s2 = sc.nextInt();

        System.out.println("Enter Third Subject Marks :)");
        int s3 = sc.nextInt();

        System.out.println("Enter Fourth Subject Marks :)");
        int s4 = sc.nextInt();

        System.out.println("Enter Fifth Subject Marks :)");
        int s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        float percentage = total/5.0f;

        System.out.println("Percentage is "+percentage+" %");

        sc.close();

    }
}