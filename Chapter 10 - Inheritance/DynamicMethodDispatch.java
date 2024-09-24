// Dynamic Method Dispatch in Java:

class Phone{

    void Call(){
        System.out.println("Calling...");
    }

    void Alarm(){
        System.out.println("Alarming...");
    }

    void On(){
        System.out.println("Turning On Phone...");
    }

}

class SmartPhone extends Phone{

    void Camera(){
        System.out.println("Capturing...");
    }

    void Play(){
        System.out.println("Playing Music...");
    }

    void On(){
        System.out.println("Turning On Smart Phone...");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        Phone ph = new Phone();
        ph.Alarm();
        ph.Call();

        SmartPhone sph = new SmartPhone();
        sph.Play();
        sph.Camera();

        Phone obj = new SmartPhone();
        obj.On();
        obj.Alarm();
        obj.Call();

    }
}
