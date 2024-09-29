// Question 6: Create an Interface TVRemote and use it to inherit another Interface SmartTVRemote.

interface TVRemote{

    void Play();
    void Pause();
    void VolumePlus();
    void VolumeMinus();
    void Forward();
    void Backward();

}

interface SmartTVRemote extends TVRemote{

    void PlayYouTube();
    void PlayNetFlix();
    void PlayPrime();
    void GoogleAssistant();

}

class Remote implements SmartTVRemote{
    
    public void Play(){
        System.out.println("Playing...");
    }

    public void Pause(){
        System.out.println("Pausing....");
    }

    public void VolumePlus(){
        System.out.println("Increasing Volume...");
    }

    public void VolumeMinus(){
        System.out.println("Decreasing Volume...");
    }

    public void Forward(){
        System.out.println("Forwarding...");
    }

    public void Backward(){
        System.out.println("Backwarding...");
    }

    public void PlayYouTube(){
        System.out.println("Playing YouTube...");
    }

    public void PlayNetFlix(){
        System.out.println("Playing NetFlix...");
    }

    public void PlayPrime(){
        System.out.println("playing Prime...");
    }

    public void GoogleAssistant(){
        System.out.println("Opening Google Assistant...");
    }

}

public class Question6 {
    public static void main(String[] args) {
    
        Remote r = new Remote();
        r.GoogleAssistant();
        
        r.Forward();
        r.Backward();
        
        r.Play();
        r.Pause();
        
        r.PlayYouTube();
        r.PlayNetFlix();
        r.PlayPrime();
        
        r.VolumePlus(); 
        r.VolumeMinus();

    }
}
