// Taking Character as Input in Java.

import java.util.Scanner;

public class TakingCharacterAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character!");
        char ch = sc.next().charAt(0);
        System.out.println("Character is: "+ch);
        sc.close();
    }
}
