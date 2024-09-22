// Question 3: Use a contructor and repeat Question 1.

class MyMainCylinder{

    // Properties
    int r;
    int h;

    // Constructor
    public MyMainCylinder(){
        this.r = 0;
        this.h = 0;
    }

    public MyMainCylinder(int r, int h){
        this.r = r;
        this.h = h;
    }

    // Setters
    public void setRadius(int r){
        this.r = r;
    }

    public void setHeight(int h){
        this.h = h;
    }

    // Getters
    public int getRadius(){
        return this.r;
    }

    public int getHeight(){
        return this.h;
    }

}

public class Question3 {
    public static void main(String[] args) {
    
        MyMainCylinder c1 = new MyMainCylinder();
        MyMainCylinder c2 = new MyMainCylinder(5,7);
        MyMainCylinder c3 = new MyMainCylinder();

        c3.setRadius(10);
        c3.setHeight(8);

        System.out.println("Radius of 1 is "+c1.getRadius());
        System.out.println("Height of 1 is "+c1.getHeight());

        System.out.println(": - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - :");
        
        System.out.println("Radius of 2 is "+c2.getRadius());
        System.out.println("Height of 2 is "+c2.getHeight());
        
        System.out.println(": - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - :");

        System.out.println("Radius of 3 is "+c3.getRadius());
        System.out.println("Height of 3 is "+c3.getHeight());
        
        System.out.println(": - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - :");
    }
}
