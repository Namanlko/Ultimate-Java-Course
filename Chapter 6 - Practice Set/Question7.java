// Question 7: Write a java program to find the minimum element in an array.

public class Question7 {
    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,5};
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<=min){
                min = arr[i];
            }
        }

        System.out.println("Minimum element is "+min);

    }
}
