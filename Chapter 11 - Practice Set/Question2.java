// Question 2: Use the Pen class from Question 1 to Create a Concrete class FountainPen with additional method changeNib().

abstract class NewPen{
    abstract void Write();
    abstract void Refill();
}

class FountainPen extends NewPen{

    void Write(){
        System.out.println("Writing...");
    }

    void Refill(){
        System.out.println("Writing...");
    }

    void changeNib(){
        System.out.println("Changing Nib...");
    }

}

public class Question2 {
    public static void main(String[] args) {
        
        FountainPen fp = new FountainPen();
        fp.Refill();
        fp.Write();
        fp.changeNib();

    }
}
