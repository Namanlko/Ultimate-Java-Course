// Question 6: Write a java program to find factorial of a given number using while loop.

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ?");
        int n = sc.nextInt();

        int i=1, fact=1;

        while(i<=n){
            fact = fact*i;
            i++;
        }

        System.out.println("Factorial is "+fact);

        sc.close();
    }
}
