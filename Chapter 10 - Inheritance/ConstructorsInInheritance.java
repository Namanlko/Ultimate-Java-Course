// Constructors in Inheritance: When a Derived class is extended from the Base class, the constructor of the Base class is executed. First allowed by the constructor of the derived class.

class Derive extends Base{

    int y;

    void Hello(){
        System.out.println("I am Derive Class!");
    }

    Derive(){
        System.out.println("Drive Class Constructor Executed!");
    }

}

class Base{

    int x;

    void Hello(){
        System.out.println("I am Base Class!");
    }

    Base(){
        System.out.println("Base Class Constructor Executed!");
    }

}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        
        Base b = new Base();
        b.Hello();

        Derive d = new Derive();
        d.Hello();

        
    }
}
