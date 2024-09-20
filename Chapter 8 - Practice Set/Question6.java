// Question 6: Create a class Circle with a method to initialize its radius, calculting area and circumference.

class Circle{

    public int r;

    public void setRadius(int r){
        this.r = r;
    }

    public float Circumference(){
        return 2*3.14f*this.r;
    }

    public float Area(){
        return 3.14f*this.r*this.r;
    }

}

public class Question6 {
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Area is "+c.Area());
        System.out.println("Circumference is "+c.Circumference());

    }
}
