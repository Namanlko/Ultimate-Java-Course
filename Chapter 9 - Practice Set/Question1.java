// Question 1: Create a class Cylinder and use getters and setters to set its radius and height.

class Cylinder{

    private int r;
    private int h;

    // Setters for Setting the value of Radius & Height.
    public void setRadius(int r){
        this.r = r;
    }

    public void setHeight(int h){
        this.h = h;
    }

    // Getters for getting the value of Radius & Height from class.
    public int getRadius(){
        return this.r;
    }

    public int getHeight(){
        return this.h;
    }

}

public class Question1{
    public static void main(String[] args) {
        
        Cylinder c = new Cylinder();
        c.setRadius(5);
        c.setHeight(8);

        System.out.println("Radius of Cylinder is "+c.getRadius());
        System.out.println("Height of Cylinder is "+c.getHeight());

    }
}