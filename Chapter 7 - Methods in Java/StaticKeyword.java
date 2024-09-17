// Static Keyword - Static keyword is used to associate a method of a given class with the class rather than the object. Static method in a class is shared by all the objects.

import java.util.Scanner;

public class StaticKeyword {

    // Function Declaration.
    public static int mySum(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :)");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :)");
        int b = sc.nextInt();

        int ans = mySum(a,b); // Here we are calling function without using object.
        System.out.println("Sum is "+ans);

        sc.close();
    }
}
