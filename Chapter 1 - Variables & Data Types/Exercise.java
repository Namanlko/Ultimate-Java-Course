// Exercise: Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Subject Marks :)");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Subject Marks :)");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Subject Marks :)");
        int c = sc.nextInt();

        float percentage = (a+b+c)/(3.0f);
        System.out.println("Percentage is "+percentage);

        sc.close();        
    }
}
