// Question 4: Create a class Rectangle with a method to initialize its side, calculating area, perimeter etc.

class Rectangle{

    public int x,y;

    public void setSides(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int Area(){
        return x*y;
    }

    public int Perimeter(){
        return 2*(x+y);
    }

}

public class Question4{
    
    public static void main(String[] args) {
        
        Rectangle s = new Rectangle();
        s.setSides(8,6);

        System.out.println("Area is "+s.Area());
        System.out.println("Perimeter is "+s.Perimeter());

    }

}
