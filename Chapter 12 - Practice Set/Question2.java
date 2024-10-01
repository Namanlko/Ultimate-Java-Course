// Question 2: Use a built-in package in Java to write a class which displays a message (by using sout) after taking input from the user.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Can I Know Your Name Please :)");
        String name = sc.nextLine();
        sc.close();

        System.out.println("Your name is "+name);

    }
}
