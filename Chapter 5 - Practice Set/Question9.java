// Question 9: Write a program to calculate the sum of the numbers occuring in the multiplication table of 8.

public class Question9 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=10; i++){
            sum = sum + 8*i;
        }

        System.out.println("Sum is "+sum);
    }
}
