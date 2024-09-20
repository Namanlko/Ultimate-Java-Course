// Question 2: Create a class CellPhone with the methods to print "Ringing...", "Vibrating..." etc.

class CellPhone{

    public void Ring(){
        System.out.println("Ringing...");
    }

    public void Vibrate(){
        System.out.println("Vibrating...");
    }

    public void Call(){
        System.out.println("Calling...");
    }

}

public class Question2 {
    public static void main(String[] args) {
        
        CellPhone c = new CellPhone();
        c.Call();
        c.Ring();
        c.Vibrate();
           
    }
}
