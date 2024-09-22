// Question 5: Repeat Question 1 for a Sphere.

class Sphere{

    int r;

    Sphere(){
        this.r = 0;
    }

    Sphere(int r){
        this.r = r;
    }

    public int getRadius(){
        return this.r;
    }

    public float getArea(){
        return 4 * 3.14f * this.r * this.r;
    }

    public float getVolume(){
        return (4.0f/3.0f) * 3.14f * this.r * this.r * this.r;
    }

}

public class Question5 {
    public static void main(String[] args) {
        
        Sphere s1 = new Sphere();
        Sphere s2 = new Sphere(5);

        System.out.println("Radius of Circle of 1: "+s1.getRadius());
        System.out.println("Area of Circle of 1: "+s1.getArea());
        System.out.println("Volume of Circle of 1: "+s1.getVolume());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("Radius of Circle of 2: "+s2.getRadius());
        System.out.println("Area of Circle of 2: "+s2.getArea());
        System.out.println("Volume of Circle of 2: "+s2.getVolume());

    }
}
