// Question 5: Write a java program to find the factorial of a given number using for loop.

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ?");
        int n = sc.nextInt();

        int fact=1;

        for(int i=1; i<=n; i++){
            fact = fact * i;
        }

        System.out.println("Factorial is "+fact);

        sc.close();
    }
}
