// Variable Arguments: Varargs also known as variable arguments is a method in java that takes input as a variable number of arguments. It is used for simplifying a method that requires a variable number of arguments.

public class VariablesArguments {

    public static void Sum(int ... arr){
        int sum = 0;
        for(int i: arr){
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }

    public static void main(String[] args) {
        
        Sum(1);
        Sum(1,2);
        Sum(1,2,3);
        Sum(1,2,3,4);
        Sum(1,2,3,4,5);
        
    }
}
