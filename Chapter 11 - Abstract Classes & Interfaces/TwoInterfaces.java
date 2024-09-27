// Note - As Multiple Inheritance is not possible in Java so we use Interfaces.

interface Bicycle{

    void speedUp();
    void applyBrake();

}

interface HornBicycle{
    
    void blowHorn1();
    void blowHorn2();

}

class SmartCycle implements Bicycle, HornBicycle{

    public void speedUp(){
        System.out.println("Speed UP...");
    }
    
    public void applyBrake(){
        System.out.println("Apply Brake...");
        
    }
    
    public void blowHorn1(){
        System.out.println("Blowing Horn 1...");
    }
    
    public void blowHorn2(){
        System.out.println("Blowing Horn 2...");
    }

}

public class TwoInterfaces {
    public static void main(String[] args) {
        
        SmartCycle sc = new SmartCycle();
        sc.applyBrake();
        sc.speedUp();
        sc.blowHorn1();
        sc.blowHorn2();

    }
}
