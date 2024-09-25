// Question 5: What is the order of Constructor execution for the following inheritance hierarchy.

// Base -> Dervied 1 -> Derived 2
// Which constuctor will be executed & in which order.

// Answer: Base Constructor will be used first and order of constructor execution will be Base, Derive1 & Dervie2.

class Base{

    Base(){
        System.out.println("Base Class Constructor Executed!");
    }

}

class Derive1 extends Base {

    Derive1(){
        System.out.println("Drive 1 Class Constructor Executed!");
    }

}

class Derive2 extends Derive1 {

    int x = 10;

    Derive2(){
        System.out.println("Drive 2 Class Constructor Executed!");
    }

    int getX(){
        return this.x;
    }

}

public class Question5 {
    public static void main(String[] args) {
        
        Derive2 obj = new Derive2();
        System.out.println("Value of x is "+obj.getX());

    }
}
