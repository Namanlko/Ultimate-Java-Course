// Question 1: Create an abstract class Pen with methods Write() and Refill() as abstract methods.

abstract class Pen{
    abstract void Write();
    abstract void Refill();
}

class MyPen extends Pen{
    void Write(){
        System.out.println("Writing...");
    }
    void  Refill(){
        System.out.println("Reflling...");
    }
}

public class Question1{
    public static void main(String[] args) {
        
        MyPen p = new MyPen();
        p.Write();
        p.Refill();

    }
}

