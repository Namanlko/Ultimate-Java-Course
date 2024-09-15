// Here we will learn how to create an array in java. About Array declaration, memory allocation, initialization.

public class ArrayCreation {
    public static void main(String[] args) {
        
        // Method 1.

        int []marks1; // Array Declaration.
        marks1 = new int[5]; // Memory Allocation of Array.

        // Initialization of Array.
        marks1[0] = 1;
        marks1[1] = 2;
        marks1[2] = 3;
        marks1[3] = 4;
        marks1[4] = 5;

        // Method 2.
        int []marks2 = new int[5]; // Array Declaration + Memory Allocation.

        // Initialization of Array.
        marks2[0] = 1;
        marks2[1] = 2;
        marks2[2] = 3;
        marks2[3] = 4;
        marks2[4] = 5;

        // Method 3.
        int []marks3 = {1,2,3,4,5}; // Array Declaration + Array Initialization.

        for(int i=0; i<marks3.length; i++){
            System.out.print(marks3[i]+" ");
        }

    }
}
