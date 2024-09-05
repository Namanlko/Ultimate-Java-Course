// Question 3: Write a java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day." text.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can I know your name please!");
        String name = sc.nextLine();
        System.out.println("Hello "+name+", have a good day.");
        sc.close();
    }
}
