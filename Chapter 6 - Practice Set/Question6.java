// Question 6: Write a java program to find the maximum element present in an array.

public class Question6 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }

        System.out.println("Maximum Element is "+max);

    }
}
