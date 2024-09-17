// Question 9: Write a function to convert Celsius Temperature to Fahrenheit.

import java.util.Scanner;

public class Question9 {

    public static float C_to_F(int c){
        return ((9.0f/5.0f)*c + 32.0f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Degree Celsius :)");
        int c = sc.nextInt();
        System.out.println("Temperture in Fahrenheit is "+C_to_F(c));
        sc.close();
    }
}
