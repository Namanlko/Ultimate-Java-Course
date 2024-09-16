// Question 2: Write a program to find out whether a given integer is present in an array or not.

public class Question2 {
    public static void main(String[] args) {
        // Let's assume that given integer be 5;
        int n = 2;

        int []arr = {1,2,3,4,5};

        boolean flag  = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Given Number is Present in the Array :)");
        }
        else{
            System.out.println("Given Number is Not Present in the Array :(");
        }

    }
}
