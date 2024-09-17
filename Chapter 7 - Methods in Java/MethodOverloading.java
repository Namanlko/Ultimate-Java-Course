// Method Overloading - Two or more methods can have same name but different parameters. Such methods are called Overload methods.

public class MethodOverloading {

    public void foo(){
        System.out.println("Hello World!! - Method Overloaded!");
    }

    public void foo(int a){
        System.out.println("Hello World!! - Method Overloaded!");
        System.out.println("Given number is "+a);
    }

    public void foo(int a, int b){
        System.out.println("Hello World!! - Method Overloaded!");
        System.out.println("Given numbers are "+a+", "+b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
        obj.foo();
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
        obj.foo(2);
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
        obj.foo(3,5);
    }
}
