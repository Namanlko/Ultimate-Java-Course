// Question 2: Create a class Rectangle and use inheritance to create another class Cuboid. Try to keep it as close to real world Scenario as possible.

class Rectangle{

    int a;
    int b;
    
    Rectangle(){
        this.a = 0;
        this.b = 0;
    }

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    int getLength(){
        return this.a;
    }

    int getWidth(){
        return this.b;
    }

    void setLength(int a){
        this.a = a;
    }

    void setWidth(int b){
        this.b = b;
    }

    int getArea(){
        return this.a * this.b;
    }

    int getPerimeter(){
        return 2 * this.a + 2 * this.b;
    }

}

class Cuboid extends Rectangle{

    int a;
    int b;
    int c;
    
    Cuboid(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    Cuboid(int a, int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getLength(){
        return this.a;
    }

    int getWidth(){
        return this.b;
    }

    int getHeight(){
        return this.c;
    }

    void setLength(int a){
        this.a = a;
    }

    void setWidth(int b){
        this.b = b;
    }

    void setHeight(int c){
        this.c = c;
    }

    int getVolume(){
        return this.a * this.b * this.c;
    }

    int getArea(){
        return 2 * ((this.a * this.b) + (this.b * this.c) + (this.c * this.a) ) ;
    }

}

public class Question2 {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();

        r1.setLength(5);
        r1.setWidth(4);

        System.out.println("Length of Rectangle is "+r1.getLength());
        System.out.println("Width of Rectangle is "+r1.getWidth());
        System.out.println("Area of Rectangle is "+r1.getArea());
        System.out.println("Width of Rectangle is "+r1.getPerimeter());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        Rectangle r2 = new Rectangle(6,3);

        System.out.println("Length of Rectangle is "+r2.getLength());
        System.out.println("Width of Rectangle is "+r2.getWidth());
        System.out.println("Area of Rectangle is "+r2.getArea());
        System.out.println("Width of Rectangle is "+r2.getPerimeter());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        Cuboid c1 = new Cuboid();

        c1.setLength(5);
        c1.setWidth(4);
        c1.setHeight(3);

        System.out.println("Length of Cuboid is "+c1.getLength());
        System.out.println("Width of Cuboid is "+c1.getWidth());
        System.out.println("Height of Cuboid is "+c1.getHeight());
        System.out.println("Area of Rectangle is "+c1.getArea());
        System.out.println("Volume of Rectangle is "+c1.getVolume());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        Cuboid c2 = new Cuboid(10,8,6);

        System.out.println("Length of Cuboid is "+c2.getLength());
        System.out.println("Width of Cuboid is "+c2.getWidth());
        System.out.println("Height of Cuboid is "+c2.getHeight());
        System.out.println("Area of Rectangle is "+c2.getArea());
        System.out.println("Volume of Rectangle is "+c2.getVolume());

    }
}
