// Switch Statement in Java.

// Here we will understand concept of switch by creating a calculator program.

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Nunber :)");
        int n1 = sc.nextInt();

        System.out.println("Enter Second Nunber :)");
        int n2 = sc.nextInt();
        
        System.out.println("Enter Operator (+,-,*,/,%) :)");
        char op = sc.next().charAt(0);

        sc.close();

        switch (op) {
            case '+': System.out.println("Answer is "+(n1+n2));
                break;
            case '-': System.out.println("Answer is "+(n1-n2));
                break;
            case '*': System.out.println("Answer is "+(n1*n2));
                break;
            case '/': System.out.println("Answer is "+(n1/n2));
                break;
            default: System.out.println("Invalid Operator!!");
                break;
        }

    }
}
