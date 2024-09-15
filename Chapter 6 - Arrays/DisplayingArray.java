// Dispalying an Array.

public class DisplayingArray {
    public static void main(String[] args) {
        // We can display element is array using loop as follows.

        int []marks  = {95,92,95,92,97};

        System.out.println("Marks are as follows:");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }
}
