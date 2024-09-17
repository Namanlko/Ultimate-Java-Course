// Recursion: Recursion is defined as a process which calls itself directly or indirectly util a base condition is met and the corresponding function is called a recursive function.

import java.util.Scanner;

public class Recursion {
    
    public static int Sum(int n){
        if(n==1){
            return 1; 
        }
        return n + Sum(n-1);
    }
    
    public static void main(String[] args) {
        // Let's understand the concept of Recusrion with the help of an example.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();

        System.out.println("Sum = "+Sum(n));
        sc.close();
        
    }
}
