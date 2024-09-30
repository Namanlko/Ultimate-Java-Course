// Here we will learn, how we can use packages in Java. We will see with the example of Math Class.

import java.lang.Math;

public class UsingPackages {
    public static void main(String[] args) {

        // Method 1.
        double ans = Math.sqrt(64);
        System.out.println("Square Root is "+ans);

        // Method 2.
        String str = new java.lang.String("Angela!");
        System.out.println("String is "+str);

    }
}

// Other Examples:
// 1) import java.lang.*;
// 2) import java.lang.String;
// 3) s = new java.lang.String("Angela!");

