// Question 5: Write a java method to print nth term of fibonacci series using recursion.

import java.util.Scanner;

public class Question5 {

    public static int Fibo(int n){
        if(n==1||n==2){
            return n;
        }
        int ans = Fibo(n-1) + Fibo(n-2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n?");
        int n = sc.nextInt();
        System.out.println(n+"th number of Fibonacci Series is "+Fibo(n));
        sc.close();
    }

}
