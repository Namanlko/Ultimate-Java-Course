// Let's understand Method Declaration, Method Calling & Class Object creation with the help of an example.

public class MethodInvocation {

    // Function Declaration.
    public int Sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        MethodInvocation obj = new MethodInvocation(); // Class Object Creation.

        int ans = obj.Sum(6, 5); // Function Call.
        System.out.println("Sum is "+ans);
    }
}
