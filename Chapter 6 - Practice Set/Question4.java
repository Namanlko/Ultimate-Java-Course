// Question 4: Create a java program to add two matrixs of size 2 X 3.

public class Question4 {
    public static void main(String[] args) {
        
        int [][]mat1 = {{1,2,3},{4,5,6}};
        int [][]mat2 = {{2,4,6},{8,10,12}};

        int [][]sum = new int[2][3];

        System.out.println("------ Matrix 1 ------");
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("------ Matrix 2 ------");
        for(int i=0; i<mat2.length; i++){
            for(int j=0; j<mat2[i].length; j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }

        // Let's add both the matrixs.
        for(int i=0; i<sum.length; i++){
            for(int j=0; j<sum[i].length; j++){
                sum[i][j] = sum[i][j] + mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("------ Sum Matrix ------");
        for(int i=0; i<sum.length; i++){
            for(int j=0; j<sum[i].length; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
