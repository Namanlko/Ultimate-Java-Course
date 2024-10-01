// Question 4: Prove that you cannot access default property but can access protected property from the sub class.

class A{

    int a = 5;
    protected int b = 10;

    void ValueOfA(){
        System.out.println("Value of a is "+a);
    }

    void ValueOfB(){
        System.out.println("Value of b is "+b);
    }

}

class B extends A{

    B(){
        System.out.println("Object of Class B is Created!!");
    }

}

public class Question4 {
    public static void main(String[] args) {

        A obj1 = new A();
        obj1.ValueOfA();
        obj1.ValueOfB();

        B obj2 = new B();
        obj2.ValueOfA();
        obj2.ValueOfB();
        System.out.println("Value of a is "+obj2.a); // It is accessible because we are in same package if we change the package we cannot access it.
        System.out.println("Value of b is "+obj2.b);

    }
}
