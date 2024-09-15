// Two Dimensional Array in Java.

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Let's understand two dimensional array in java with the help of an example.

        // Two Dimensional Array Declaration + Memory Allocation.

        int [][]flats = new int[2][3];

        flats[0][0] = 1;
        flats[0][1] = 2;
        flats[0][2] = 3;
        flats[1][0] = 4;
        flats[1][1] = 5;
        flats[1][2] = 6;

        // Displaying Two Dimensional Array. Similarly we can take two dimesional array as an input.
        
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
