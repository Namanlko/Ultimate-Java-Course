// Access Modifiers in Java: Access Modifiers determine whether other classes can use a particular field or invoke a particular method. Can be public, private, protected or default (no modifer).

// There are four types of Access Modifiers in Java:

// 1) Public 
// 2) Protected
// 3) Default (No)
// 4) Private

class ABC{

    private int a = 8;
    int b = 8;
    protected int c = 10;

    void getValueA(){
        System.out.println("Value of a is "+a);
    }

    void getValueB(){
        System.out.println("Value of b is "+b);
    }

    void getValueC(){
        System.out.println("Value of c is "+c);
    }

}

class XYZ extends ABC{

    void Show(){
        System.out.println("This is XYZ Class!");
    }

}

public class AccessModifiersInJava {
    public static void main(String[] args) {
        
        ABC obj1 = new ABC();
    //  System.out.println(obj1.a); // It will show error that integer have private modifier it can be accessible only within the class.
        obj1.getValueA();

        ABC obj2 = new ABC();
        System.out.println(obj2.b); // It will not show any error as b has default access modifiers which can be accessible within same package.
        obj2.getValueB();

        XYZ obj3 = new XYZ();
        obj3.getValueC(); // It will not show any error as c has protected access modifiers which can be accessible within Sub Class also.

        XYZ obj4 = new XYZ();
        obj4.Show();

    }
}
