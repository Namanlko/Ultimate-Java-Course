// Question 3: Calculate income tax paid by an employee to the goverment as per the slabs mentioned below.

// Income Slab      Tax
// 2.5 L - 5.0 L    5%
// 5.0 L - 10.0 L   10%
// Above 10.0 L     30%

// Note: Note that there is no tax below 2.5 L. Take input amount as an input from the user.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can I Know Your Income in Lakhs Please!");
        double income = sc.nextDouble();

        double tax = 0;

        if(income<2.5){
            tax = tax + 0;
        }
        else if(income>=2.5 && income<5.0){
            tax  = tax + 0.05 * (income - 2.5);
        }
        else if(income>=5.0 && income<10.0){
            tax  = tax + 0.05 * (5.0 - 2.5);
            tax  = tax + 0.2 * (income - 5.0);
        }
        else if(income>=10.0){
            tax  = tax + 0.05 * (5.0 - 2.5);
            tax  = tax + 0.2 * (10.0 - 5.0);
            tax  = tax + 0.3 * (income - 10.0);
        }
        System.out.println("Total Tax paid by employee is "+tax+" lakhs.");
        sc.close();
    }
}
