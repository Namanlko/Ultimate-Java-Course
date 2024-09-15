// Quick Quiz: Write a java program to print the elements of an array in reverse order.

public class QuickQuiz {
    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Elements of Array in Reverse Order Is:");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
