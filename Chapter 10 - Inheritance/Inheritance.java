// Inheritance: Inheritance is used to borrow properties and methods from an existing class.

// Examples
// 1) Phone -> Smart phone
// 2) SuperClass -> SubClass
// 3) Parent -> Child

// In java inhertiance is decalred by using extends kwyword.

class Child extends Parent{
    void HelloChild(){
        System.out.println("I am Child Class.");
    }    
}

class Parent{
    void HelloParent(){
        System.out.println("I am Parent Class.");
    }
}


public class Inheritance{
    public static void main(String[] args) {
        
        Parent a = new Parent();
        a.HelloParent();

        Child b = new Child();
        b.HelloParent();
        b.HelloChild();

    }
}