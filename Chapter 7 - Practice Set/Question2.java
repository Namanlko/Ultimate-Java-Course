// Question 2: Write a java program using functions to print the following pattern.

// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;

public class Question2 {
    
    public static void Pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
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
