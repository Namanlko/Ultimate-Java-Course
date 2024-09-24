// Method Overriding in Inheritance.

class A{

    void Method1(){
        System.out.println("Hi, I am Method 1 of Base Class A.");
    }

    void Method2(){
        System.out.println("Hi, I am Method 2 of Base Class A.");
    }

}

class B extends A{

    @Override
    void Method2(){
        System.out.println("Hi, I am Method 2 of Derive Class B.");
    }

    void Method3(){
        System.out.println("Hi, I am Method 3 of Derive Class A.");
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        
        A a = new A();
        a.Method1(); 
        a.Method2();
        
        B b = new B();
        b.Method1();
        b.Method2(); 
        b.Method3();

    }
}
