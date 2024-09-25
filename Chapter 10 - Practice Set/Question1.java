// Question 1: Create a class Circle and use Inheritance to create another class from it.


class Circle{

    int radius;

    Circle(){
        this.radius = 0;
    }

    Circle(int r){
        this.radius = r;
    }

    void setRadius(int r){
        this.radius = r;
    }

    int getRadius(){
        return this.radius;
    }

    float Area(){
        return 3.14f * this.radius * this.radius; 
    }

    float Circumference(){
        return 2.0f * 3.14f * this.radius; 
    }

}


class Cylinder extends Circle{

    int radius;
    int height;

    Cylinder(){
        this.radius = 0;
        this.height = 0;
    }

    Cylinder(int r, int h){
        this.radius = r;
        this.height = h;
    }

    void setRadius(int r){
        this.radius = r;
    }

    void setHeight(int h){
        this.height = h;
    }

    int getRadius(){
        return this.radius;
    }

    int getHeight(){
        return this.height;
    }

    float getArea(){
        return (2.0f * 3.14f * this.radius * this.height) + (2.0f * 3.14f * this.radius * this.radius);
    }

    float getVolume(){
        return (3.14f * this.radius * this.radius * this.height);
    }

}

public class Question1{
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("Radius is "+c1.getRadius());
        System.out.println("Area is "+c1.Area());
        System.out.println("Circumference is "+c1.Circumference());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        Circle c2 = new Circle(10);
        System.out.println("Radius is "+c2.getRadius());
        System.out.println("Area is "+c2.Area());
        System.out.println("Circumference is "+c2.Circumference());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");


        Cylinder c3 = new Cylinder();
        c3.setRadius(5);
        c3.setHeight(8);
        System.out.println("Radius is "+c3.getRadius());
        System.out.println("Height is "+c3.getHeight());
        System.out.println("Area is "+c3.getArea());
        System.out.println("Circumference is "+c3.getVolume());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        Cylinder c4 = new Cylinder(4,7);
        System.out.println("Radius is "+c4.getRadius());
        System.out.println("Height is "+c4.getHeight());
        System.out.println("Area is "+c4.getArea());
        System.out.println("Circumference is "+c4.getVolume());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

    }
}