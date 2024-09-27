// Multiple Inheritance: 

// Multiple Inheritance face problems when there exist methods with same signature in both the super classes. Due to such problems, Java does not support multiple inheritance directly but the similar concept can be achieved using interfaces. A class can implement multiple interfaces and extend a class at the same time.

// Note:
// 1) Intefaces in Java is a bit like the Class but with a significant difference. 
// 2) An interface can only have method signatures, constant fields and default methods.
// 3) The class implementing an interface needs to define all the methods not fields. 
// 4) You can create a reference of Interfaces but not the objects.
// 5) Interface methods are public by default.

interface GPS{
    void showMap();
}

interface Camera{
    void onCamera();
}

class Phone implements GPS, Camera{

    public void showMap(){
        System.out.println("Showing the Map!");
    }
    
    public void onCamera(){
        System.out.println("Turning on the Camera!");
    }

}

public class MultipleInheritance{
    public static void main(String[] args) {
        
        Phone ph = new Phone();
        ph.onCamera();
        ph.showMap();
        
    }
}
