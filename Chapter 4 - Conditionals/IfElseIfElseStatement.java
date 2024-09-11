// If Else-If Else Statement in Java.

// If Else-If Else Statement is used to check more than one conditon in Java.

import java.util.Scanner;

public class IfElseIfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :)");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Positive No :)");
        }
        else if(n<0){
            System.out.println("Negative No :(");
        }
        else{
            System.out.println("No is Zero :|");
        }

        sc.close();


    }
}
