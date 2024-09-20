// Question 3: Create a class Square with a method to initialize its side, calculating area, perimeter etc.

class Square{

    public int x;

    public void setSides(int x){
        this.x = x;
    }

    public int Area(){
        return x*x;
    }

    public int Perimeter(){
        return 4*x;
    }

}

public class Question3{
    
    public static void main(String[] args) {
        
        Square s = new Square();
        s.setSides(5);

        System.out.println("Area is "+s.Area());
        System.out.println("Perimeter is "+s.Perimeter());

    }

}