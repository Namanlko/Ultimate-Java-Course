// Question 1: Create an array of 5 floats and calculate their sum.

public class Question1{
    public static void main(String[] args) {
        
        float []arr = {10.0f,20.0f,30.0f,40.0f,50.0f,60.0f};

        float sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum is "+sum);
    }
}