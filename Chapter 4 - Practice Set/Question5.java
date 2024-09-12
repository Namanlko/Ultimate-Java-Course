// Question 5: Write a java program to find whether a year entered by the user is a leap year or not.

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year :)");
        int n = sc.nextInt();

        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("Leap Year!");
                }
                else{
                    System.out.println("Not Leap Year!");
                }
            }
            else{
                System.out.println("Leap Year!");
            }
        }
        else{
            System.out.println("Not Leap Year!");
        }
        sc.close();
    }
}
