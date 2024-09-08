// Question 3: Use comparsion operator to find out whether a given number is greater than the user entered number or not.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :)");
        int num = sc.nextInt();

        // Lets given number be n = 11;
        int n = 11;
        System.out.println("Is Given Number is Greater Than Enetered Number? :"+(n>num));
        
        sc.close();
        
    }
}
