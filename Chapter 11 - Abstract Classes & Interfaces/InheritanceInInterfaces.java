// Inheritance in Interfaces: Interfaces can extend another interfaces. Implemeting an interface forces method implimentation.
// Note: Remember that interface cannot implement another interface, only classes can do that! 

interface Interface1{
    void method1();
}

interface Interface2 extends Interface1{
    void method2();
}

class MySampleClass implements Interface2{

    public void method1(){
        System.out.println("Hi, I'm Method 1.");
    }

    public void method2(){
        System.out.println("Hi, I'm Method 2.");
    }

}

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        
        MySampleClass c = new MySampleClass();
        c.method1();
        c.method2();

    }
}

