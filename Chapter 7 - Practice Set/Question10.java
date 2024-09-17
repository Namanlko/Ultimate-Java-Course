// Question 10: Write a function to calculate sum of first n natural numbers using iterative approach.

import java.util.Scanner;

public class Question10 {

    public static int Sum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();
        System.out.println("Sum = "+Sum(n));
        sc.close();
    }
}

