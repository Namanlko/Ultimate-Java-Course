// Question 4: Write a java program to convert Kilometer to Miles.

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in KM :)");
        int km = sc.nextInt();
        System.out.println("Distance in Miles is "+km*0.62f);
        sc.close();
    }
}
