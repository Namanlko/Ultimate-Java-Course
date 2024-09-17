// Question 3: Write a recursive function to calculate sum of first n natural numbers.

import java.util.Scanner;

public class Question3 {

    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        return n + Sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();
        System.out.println("Sum = "+Sum(n));
        sc.close();
    }

}
