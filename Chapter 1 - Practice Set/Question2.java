// Question 2: Write a program to calculate CGPA using marks of three subjects (Out of 100.)

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks :)");
        int a = sc.nextInt();
        System.out.println("Enter Second Subject Marks :)");
        int b = sc.nextInt();
        System.out.println("Enter Third Subject Marks :)");
        int c = sc.nextInt();
        
        float cgpa = (a+b+c)/(30.0f);
        System.out.println("CGPA is "+cgpa);

        sc.close();

    }
}
