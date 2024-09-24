// Constructor Overloading in Inheritance: 

// When there are multiple constructors in the parent class, the constructor without any parameter is called from the Child class.
// If we want to call the consturctor  with parameters from the parent class, we can user Super keyword.

// Ex: super(a,b);

// Super Keyword: A reference variable used to refer immediate parent class object.
// 1) Can be used to refer immediate parent class instance variable.
// 2) Can be used to invoke parent class methods.
// 3) Can be used to invoke parent class constructors.

// Note - Like Super Keyword there is "this" keyword.

// This is a way for us to reference an object of the class which is being created or referenced.
// Ex - this.area = 2; -> This is a reference to Current Object.

class Derive1 extends Base1{
    
    Derive1(){
        System.out.println("Derive Class Constructor Executed!");
    }

    Derive1(int x, int y){
        super(x);
        System.out.println("Derive Class Parameterised Constuctor Executed with value of y is "+y);
    }

    void Hello(){
        System.out.println("Hello, I am Derive Class!");
    }

}

class Base1{
    
    Base1(){
        System.out.println("Base Class Constructor Executed!");
    }

    Base1(int x){
        System.out.println("Base Class Parameterised Constuctor Executed with value of x is "+x);
    }

    void Hello(){
        System.out.println("Hello, I am Base Class!");
    }

}

public class ConstructorOverloadingInInheritance {
    public static void main(String[] args) {
        
        Base1 b = new Base1();
        b.Hello();

        Derive1 d = new Derive1(1,2);
        d.Hello();

    }
}
