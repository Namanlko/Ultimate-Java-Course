// Question 4: Overload a Constructor used to initilize a Rectangle of length 4 and breadth for 5 for using Custom parameters. 

class Rectangle{

    int l;
    int b;

    Rectangle(){
        this.l = 4;
        this.b = 5;
    }

    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    public int getLength(){
        return this.l;
    }

    public int getBreadth(){
        return this.b;
    }

}

public class Question4 {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,8);

        System.out.println("Length of Rectangle 1 is "+r1.getLength());
        System.out.println("Breadth of Rectangle 1 is "+r1.getBreadth());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("Length of Rectangle 2 is "+r2.getLength());
        System.out.println("Breadth of Rectangle 2 is "+r2.getBreadth());

    }
}
