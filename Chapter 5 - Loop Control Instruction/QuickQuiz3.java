// Quick Quiz 3: Write a java program to print first n odd numbers using a for loop.

import java.util.Scanner;

public class QuickQuiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n?");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
