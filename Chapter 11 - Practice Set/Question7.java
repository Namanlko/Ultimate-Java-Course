// Question 7: Create a Class TV which implements TvRemote Interface from Question 6.

interface TvRemote{
    void Play();
    void Pause();
    void VolumePlus();
    void VolumeMinus();
    void Forward();
    void Backward();
}

class TV implements TvRemote{

    public void Play(){
        System.out.println("Playing...");
    }

    public void Pause(){
        System.out.println("Pausing...");
    }

    public void VolumePlus(){
        System.out.println("Increasing Volume...");
    }

    public void VolumeMinus(){
        System.out.println("Decreasing Volume...");
    }

    public void Forward(){
        System.out.println("Forwarding Video/Audio...");
    }

    public void Backward(){
        System.out.println("Backwarding Video/Audio...");
    }

}

public class Question7 {
    public static void main(String[] args) {
        
        TV t = new TV();
        
        t.Forward();
        t.Backward();
        
        t.Play();
        t.Pause();
        
        t.VolumePlus();
        t.VolumeMinus();

    }
}


