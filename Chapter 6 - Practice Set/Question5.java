// Question 5: Write a java program to reverse an array.

public class Question5 {
    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,5};

        for(int i=0; i<=arr.length/2; i++){
            int n = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = n;
        }

        System.out.println("Reverse Array Is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
