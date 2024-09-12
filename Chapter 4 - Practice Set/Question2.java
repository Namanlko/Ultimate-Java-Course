// Question 2: Write a program to find out whether a student is pass or fail. if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks :)");
        int a = sc.nextInt();
        System.out.println("Enter Second Subject Marks :)");
        int b = sc.nextInt();
        System.out.println("Enter Third Subject Marks :)");
        int c = sc.nextInt();

        int total = a + b + c;
        double percentage = total/3.0;
        
        if(a>33 && b>33 && c>33 && percentage>=40){
            System.out.println("Congratulations! You Passed the Exam :) with "+percentage+" %");
        }
        else{
            System.out.println("Sorry! You Failed the Exam :(");
        }

        sc.close();
    }
}
