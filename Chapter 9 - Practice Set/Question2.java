// Question 2: Use Question 1 to calculate Surface Area and Volume of the Cylinder.

class MyCylinder{

    float r;
    float h;

    public void setRadius(int r){
        this.r = r;
    }

    public void setHeight(int h){
        this.h = h;
    }

    public float getRadius(){
        return this.r;
    }

    public float getHeight(){
        return this.h;
    }

    public float getArea(){
        return (2 * 3.14f * this.r *this.h) +(2 * 3.14f * this.r * this.r);
    }

    public float getVolume(){
        return 3.14f * this.r * this.r * this.h;
    }

}

public class Question2 {
    public static void main(String[] args) {
        
        MyCylinder c = new MyCylinder();
        c.setRadius(5);
        c.setHeight(8);

        System.out.println("Radius is "+c.getRadius());
        System.out.println("Height is "+c.getHeight());
        System.out.println("Area is "+c.getArea());
        System.out.println("Volume is "+c.getVolume());

    }
}
