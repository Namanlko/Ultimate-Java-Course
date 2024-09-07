// Increment and Decrement Operator in Java.

// Increment and Decrement operator are used to increase or decrease the value of a variable by 1. It is also know as unary operator as it is applied to a single variable only.

// There are two types of increment and decrement operator.
// 1) Pre Increment/ Pre Decrement.
// 2) Post Increment/ Post Decrement.

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        
        // 1) Pre Increment:
        // It increases the value of variable before using it in an expression.
        int a=10;
        System.out.println(++a);
        System.out.println(a);

        // 2) Post Increment:
        // It increases the value of variable after using it in an expression.
        int b=10;
        System.out.println(b++);
        System.out.println(b);

        // 3) Pre Decrement:
        // It decreases the value of variable before using it in an expression.
        int c=10;
        System.out.println(--c);
        System.out.println(c);

        // 4) Post Decrement:
        // It decreases the value of variable after using it in an expression.
        int d=10;
        System.out.println(d--);
        System.out.println(d);

    }
}
