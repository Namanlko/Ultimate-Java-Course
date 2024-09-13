// Quick Quiz 2: Write a program to print first n natural numbers using do while loop.

import java.util.Scanner;

public class QuickQuiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();

        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);

        sc.close();
    }
}
