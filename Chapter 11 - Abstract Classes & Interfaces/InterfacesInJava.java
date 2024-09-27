// Interfaces in Java: Interface in english is a point where two systems meet and interact. 
// In java interface is a group of related methods with empty bodies.


interface Bicycle{

    void applyBrake(int decrement);
    void speedUp(int increment);

}

class AvonCycle implements Bicycle{

    int speed = 7;

    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println("Apply Break...");
    }

    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Speed Up...");
    }

}

public class InterfacesInJava {
    public static void main(String[] args) {
        
        AvonCycle av = new AvonCycle();
        av.speedUp(0);
        av.applyBrake(0);

    }
}

// Abstract Class Vs Interfaces - We can't extend multiple abstract class but we can implement multiple interfaces at a time. Interfaces are meant for Dynamic Method Dispatch and run time ploymorphism. 