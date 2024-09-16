// Question 8: Write a java program to find whether an array is sorted or not.

public class Question8 {
    public static void main(String[] args) {
        
        int []arr = {1,2,3,5,4};

        boolean flag = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                flag = false;
            }
        }

        if(flag){
            System.out.println("Array is Sorted!");
        }
        else{
            System.out.println("Array is Not Sorted!");
        }

    }
}
