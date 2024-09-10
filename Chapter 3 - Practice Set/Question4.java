// Question 4: Write a java program to detect double and triple spaces in a String.

public class Question4 {
    public static void main(String[] args) {
        
        String str = "Hello, This  is Ultimate Java Course   by Code With Harry";

        System.out.println("Double Spaces is present at index: "+str.indexOf("  "));
        System.out.println("Triple Spaces is present at index: "+str.indexOf("   "));

    }
}
