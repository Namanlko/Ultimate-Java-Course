// Taking String as a Input in Java.

import java.util.Scanner;

public class TakingStringAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String!");
        String str = sc.next();
        System.out.println("String is: "+str);
        sc.close();
    }
}