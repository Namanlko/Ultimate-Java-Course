// Question 2: Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can I Know Your Grade Please!");
        char grade = sc.next().charAt(0);
        char encrypt = (char)(grade+8);
        System.out.println("Encypted Grade is "+encrypt); 
        System.out.println("Decypted Grade is "+(char)(encrypt-8)); 
        sc.close();        

    }
}
