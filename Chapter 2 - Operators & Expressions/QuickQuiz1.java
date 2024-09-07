// Quick Quiz1: How will you write the following expressions in Java?

// 1) (x - y)/2
// 2) (b*b - 4*a*c)/(2*a)
// 3) (v*v - u*u)
// 4) (a*b - d)

public class QuickQuiz1 {
    public static void main(String[] args) {
        int x=10, y=6, a=2, b=10, c=1, d=1, u=8, v=6;

        int result1 = (x - y)/2;
        int result2 = (b*b - 4*a*c)/(2*a);
        int result3 = (v*v - u*u);
        int result4 = (a*b - d);

        System.out.println("Expression 1 result is "+result1);
        System.out.println("Expression 2 result is "+result2);
        System.out.println("Expression 3 result is "+result3);
        System.out.println("Expression 4 result is "+result4);

    }
}
