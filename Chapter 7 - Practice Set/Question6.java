// Question 6: Write a function to find average of a set of numbers passed as argument.

import java.util.Scanner;

public class Question6 {

    public static void Average(int...arr){
        int sum = 0;
        int j = 0;
        for(int i:arr){
            sum = sum + i;
            j++;
        }
        int avg = sum/j;
        System.out.println("Average is "+avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Average(1,2,3,4,5,6,7,8,9,10);
        sc.close();
    }
}
