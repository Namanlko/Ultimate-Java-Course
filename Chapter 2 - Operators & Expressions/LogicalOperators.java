// Logical Operator in Java.

// Logical operators in Java are used to perform logical operations on boolean expressions. 
// The main logical operators are && (logical AND), || (logical OR), and ! (logical NOT).

public class LogicalOperators {
    public static void main(String[] args) {

        int x = 5, y = 10, p = 15, q = 20;

        System.out.println( (x<y) && (p<q) );
        System.out.println( (x>y) && (p<q) );

        System.out.println( (x<y) || (p<q) );
        System.out.println( (x>y) || (p<q) );

        boolean flag = false;
        System.out.println(!flag);

    }
}
