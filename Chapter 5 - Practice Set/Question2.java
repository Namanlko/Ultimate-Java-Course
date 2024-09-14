// Question 2: Write a java program to sum first n even numbers using while loop.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();
        sc.close();

        int sum = 0, i = 1;

        while(i<=n){
            if(i%2==0){
                sum = sum + i;
            }
            i++;
        }

        System.out.println("Even Sum is "+sum);

    }
}

