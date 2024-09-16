// Question 3: Calculate the average marks from an array containing marks of all student in Physics using for each loop.

public class Question3 {
    public static void main(String[] args) {
        
        int []physicsMarks = {98,90,97,99,89};

        int sum = 0;

        for(int i=0; i<physicsMarks.length; i++){
            sum = sum + physicsMarks[i];
        }

        System.out.println("Average Marks are : "+sum/physicsMarks.length);

    }
}
