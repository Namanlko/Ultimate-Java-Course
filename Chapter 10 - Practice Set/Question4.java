// Question 4: Create a class MainRectangle and use inheritance to create another class MainCuboid. Try to keep it as close to real world Scenario as possible. Also create methods for area and volume, getters and setters also.

class MainRectangle{

    int a;
    int b;
    
    MainRectangle(){
        this.a = 0;
        this.b = 0;
    }

    MainRectangle(int a, int b){
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

class MainCuboid extends MainRectangle{

    int a;
    int b;
    int c;
    
    MainCuboid(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    MainCuboid(int a, int b,int c){
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

public class Question4 {
    public static void main(String[] args) {
        
        MainRectangle r1 = new MainRectangle();

        r1.setLength(5);
        r1.setWidth(4);

        System.out.println("Length of MainRectangle is "+r1.getLength());
        System.out.println("Width of MainRectangle is "+r1.getWidth());
        System.out.println("Area of MainRectangle is "+r1.getArea());
        System.out.println("Width of MainRectangle is "+r1.getPerimeter());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        MainRectangle r2 = new MainRectangle(6,3);

        System.out.println("Length of MainRectangle is "+r2.getLength());
        System.out.println("Width of MainRectangle is "+r2.getWidth());
        System.out.println("Area of MainRectangle is "+r2.getArea());
        System.out.println("Width of MainRectangle is "+r2.getPerimeter());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        MainCuboid c1 = new MainCuboid();

        c1.setLength(5);
        c1.setWidth(4);
        c1.setHeight(3);

        System.out.println("Length of MainCuboid is "+c1.getLength());
        System.out.println("Width of MainCuboid is "+c1.getWidth());
        System.out.println("Height of MainCuboid is "+c1.getHeight());
        System.out.println("Area of MainRectangle is "+c1.getArea());
        System.out.println("Volume of MainRectangle is "+c1.getVolume());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        MainCuboid c2 = new MainCuboid(10,8,6);

        System.out.println("Length of MainCuboid is "+c2.getLength());
        System.out.println("Width of MainCuboid is "+c2.getWidth());
        System.out.println("Height of MainCuboid is "+c2.getHeight());
        System.out.println("Area of MainRectangle is "+c2.getArea());
        System.out.println("Volume of MainRectangle is "+c2.getVolume());

    }
}

