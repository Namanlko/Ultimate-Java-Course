// Question 5. Write a Java program to detect whether a number entered by the user is integer or not.

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something!");
        System.out.println("Entered Value is Integer: "+sc.hasNextInt());
        sc.close();
    }
}
