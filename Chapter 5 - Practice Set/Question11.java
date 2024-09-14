// Question 11: Write a program to sum first n even numbers using for loop.

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }

        System.out.println("Sum is "+sum);

        sc.close();
    }
}
