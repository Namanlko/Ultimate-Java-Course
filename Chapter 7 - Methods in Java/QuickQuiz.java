// Quick Quiz: Write a program to calculate (Recursion must be used) factorial of a number in Java.

import java.util.Scanner;

public class QuickQuiz {

    public static int Fact(int n){
        if(n==1){
            return 1;
        }
        return n * Fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();

        System.out.println("Factorial is "+Fact(n));

        sc.close();
    }
}
