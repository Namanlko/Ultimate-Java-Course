// Abstract Classes & Interfaces in Java.

interface Bycycle{

    int speed = 40;

    void applyBrake(int decrement);
    void speedUp(int increment);

}

class AvonCycle implements Bycycle{

    void blowHorn(){
        System.out.println("Pee Pee Poo Poo...");
    }

    public void applyBrake(int decrement){
        System.out.println("Applying Brake...");
    }

    public void speedUp(int increment){
        System.out.println("Applying Speed Up...");
    }

}

public class AbstractClassesAndInterfaces {
    public static void main(String[] args) {

        AvonCycle av = new AvonCycle();
        av.applyBrake(0);
        av.speedUp(0);
        av.blowHorn();
        System.out.println("Speed is "+Bycycle.speed);
        
    }
}
