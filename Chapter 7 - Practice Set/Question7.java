// Question 7: Write a recursive function to print the following pattern.

// * * * * *
// * * * *
// * * *
// * *
// *

import java.util.Scanner;

public class Question7 {

    public static void Pattern(int n){
        if(n>0){
            Pattern(n-1);
            for(int i=1; i<=n; i++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();
        Pattern(n);
        sc.close();
    }
}
