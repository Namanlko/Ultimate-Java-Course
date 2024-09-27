// Abstract Classes: Abstract in english means existing in thaught or as an idea in mind without concrete existance.

// Abstract Method: A method that is declared without an implimentation.
// Ex: abstract void moveTo(double X, double Y);

// Question 1: It is possible to create object of an abstract class?
// Answer: No, it is not possible to create an object of an abstract class. We can only use abstract class as a Base Class for a Derived Class.

abstract class Phone{

    abstract void PowerOn();
    abstract void PowerOff();
    abstract void Restart();
    abstract void Reboot();

}

class SmartPhone extends Phone{
    @Override
    void PowerOn(){
        System.out.println("Mobile is Switched On!");
    }
    
    @Override
    void PowerOff(){
        System.out.println("Mobile is Switched Off!");
        
    }
    
    @Override
    void Restart(){
        System.out.println("Mobile is Restarted!");
        
    }
    
    @Override
    void Reboot(){
        System.out.println("Mobile is Rebooted!");

    }

}


public class AbstractClasses{
    public static void main(String[] args) {
        
        SmartPhone sp = new SmartPhone();
        sp.PowerOn();
        sp.PowerOff();
        sp.Restart();
        sp.Reboot();

    }
}