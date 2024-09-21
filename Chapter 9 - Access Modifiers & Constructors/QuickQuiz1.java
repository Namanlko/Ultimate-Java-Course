// Quick Quiz 1: Use these getters and setters from the main method. Create a class name Circle.

class Cricle{

    int radius;

    public void setRadius(int r){
        this.radius = r;
    }

    public int getRadius(){
        return this.radius;
    }

    public float getCircumference(){
        return 2 * 3.14f * this.radius;
    }

    public float getArea(){
        return 3.14f * this.radius * this.radius;
    }
}

public class QuickQuiz1 {
    public static void main(String[] args) {
        
        Cricle c = new Cricle();
        c.setRadius(8);

        System.out.println(c.getRadius());
        System.out.println(c.getCircumference());
        System.out.println(c.getArea());

    }
}
