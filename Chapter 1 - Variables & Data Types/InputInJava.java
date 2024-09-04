// Taking User Input in Java.

// For taking user input in java we have to use Scanner class and we also have to import Scanner class from util package.

import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can I know your name please!");
        String name = sc.nextLine();
        System.out.println("Hello "+name+", Great to See You Here :)");
        sc.close();
    }    
}
