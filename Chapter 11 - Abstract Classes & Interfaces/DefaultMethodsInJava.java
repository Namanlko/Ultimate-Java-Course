// Default Methods in Java: An interface can have static and default methods. Deafult methods enable us to add new functionality to existing interfaces. This feature was introduced in Java 8 to ensure backward compatibilty while updating an interface.

// Classes implemeting the interface need not implement the default methods. Interfaces can also include private methods for default methods to use.

interface Camera{

    void takeSnap();
    void recordVideo();
    
    // Default Method in Interface: 
    default void record4KVideo(){
        System.out.println("Recording in 4k...");
    }

}

interface wifi{

    String[] getNetworks();
    void connectToNetwork(String network);

}

class MyCellPhone{

    void Call(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }

    void PickCall(){
        System.out.println("Connecting...");
    }

}

class SmartPhone extends MyCellPhone implements wifi, Camera{

    public void takeSnap(){
        System.out.println("Taking Snap...");
    }

    public void recordVideo(){
        System.out.println("Recording Video...");
    }

    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String []networks = {"Angela", "Yu", "Harry"};
        return networks;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to Network "+network);
    }

}

public class DefaultMethodsInJava {
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();
        sp.Call(7654321);
        sp.PickCall();
        sp.connectToNetwork("Polestar");
    
        for(String s:sp.getNetworks()){
            System.out.print(s+", ");
        }
        sp.takeSnap();
        sp.recordVideo();

    }
}


