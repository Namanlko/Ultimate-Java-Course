// Methods in Java.

// Methods in java are same as function in other programming languages. It is a block of code which is used to perform a specific task.

import java.util.Scanner;

public class Methods{
    
    // Method Declaration. Note - If we don't using static keyword then we can use this method with the help of object of class.
    public static int Sum(int a, int b){
        return a+b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :)");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number :)");
        int n2 = sc.nextInt();

        int ans = Sum(n1,n2);
        System.out.println("Sum is "+ans);

        sc.close();


    }
}