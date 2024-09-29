// Question 4: Create a class TelePhone with Ring(), Lift() and Disconnect() methods as abstract methods. Create another class SmartTelephone and demosntrate ploymorphism.

abstract class TelePhone{

    abstract void Ring();
    abstract void Lift();
    abstract void Disconnect();

}

class SmartTelephone extends TelePhone{

    public void Ring(){
        System.out.println("Ringing...");
    }
    public void Lift(){
        System.out.println("Lifting...");
    }
    public void Disconnect(){
        System.out.println("Disconnecting...");
    }
    public void Camera(){
        System.out.println("Capturing Photos with Camera...");
    }

}

public class Question4 {
    public static void main(String[] args) {
        
        SmartTelephone sp = new SmartTelephone();
        sp.Disconnect();
        sp.Lift();
        sp.Ring();
        sp.Camera();

        // Here we are taking reference of Telephone -> It means we can use SmartPhone as a CellPhone Only. This is called Ploymorphism.
        TelePhone tp = new SmartTelephone();
        tp.Disconnect();
        tp.Lift();
        tp.Ring();

    }
}
