// Polymorphism using Interface in Java:

interface MyCamera{
    void takeSnap();
}

interface MyGPS{
    void giveLocation();
}

interface MediaPlayer{
    void play();
}

class CellPhone{
    void Call(){
        System.out.println("Calling...");
    }
}

class SmartPhone extends CellPhone implements MyCamera, MediaPlayer,MyGPS{
    
    void Wifi(){
        System.out.println("Connecting With Wi-fi...");
    }

    public void takeSnap(){
        System.out.println("Taking Snap Shot...");
    }
    
    public void giveLocation(){
        System.out.println("Giving Location...");
    }
    
    public void play(){
        System.out.println("Playing...");
    }

}

public class PolymorphismUsingInterfaces {
    public static void main(String[] args) {
        
        // Here we are creating reference of Interface. 
        MyCamera obj1 = new SmartPhone(); // This is a Smart Phone but, we can use it as camera only.
        obj1.takeSnap();

        MyGPS obj2 = new SmartPhone();
        obj2.giveLocation(); // This is a Smart Phone but, we can use it as a GPS getting device only.

        MediaPlayer obj3 = new SmartPhone();
        obj3.play(); // This is a Smart Phone but, we can use it as a Media Player only.

    }
}
