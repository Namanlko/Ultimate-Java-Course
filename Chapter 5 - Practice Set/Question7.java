// Question 7: Write a program to print the following pattern.

// 1) For Loop
// 2) While Loop

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :)");
        int n = sc.nextInt();

        // 1) For Loop
        System.out.println("---------- Using For Loop ----------");
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // 2) While Loop
        System.out.println("---------- Using While Loop ----------");
        int i=1;
        while(i<=n){
            int j=n;
            while(j>=i){
                System.out.print(" * ");
                j--;
            }
            i++;
            System.out.println();
        }

        sc.close();
    }
}
