// Array in Java.

// Array is a linear data structure which is used to store homogenous elements. An array element can be access using index. Array has zero based indexing. 

public class Array{
    public static void main(String[] args) {
        // Let's understand array with the help of an example.

        int []marks = new int[5]; // Here an integer array named marks is created and it can store 5 integer values.

        // With the help of indexing we can assign the values to the array. Let's understand with the help of an example.

        marks[0] = 95; // At 0 Index value is 95.
        marks[1] = 92; // At 1 Index value is 92.
        marks[2] = 95; // At 2 Index value is 95.
        marks[3] = 92; // At 3 Index value is 92.
        marks[4] = 91; // At 4 Index value is 91.

        System.out.println("Marks at 0 Index is "+marks[0]);
        System.out.println("Marks at 1 Index is "+marks[1]);
        System.out.println("Marks at 2 Index is "+marks[2]);
        System.out.println("Marks at 3 Index is "+marks[3]);
        System.out.println("Marks at 4 Index is "+marks[4]);
    }
}