// Quick Quiz 4: Write a java program to print first n natural numbers in reverse order.

import java.util.Scanner;

public class QuickQuiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            System.out.println(i);
        }

        sc.close();
    }
}
