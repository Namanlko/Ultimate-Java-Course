// Question 5: Create a class TommyVecetti for Rock Star Games capable of hitting (print hitting), running, firing etc.

class TommyVecetti{
    
    public void Hit(){
        System.out.println("Hitting...");
    }

    public void Run(){
        System.out.println("Running...");
    }

    public void Fire(){
        System.out.println("Firing...");
    }

}

public class Question5 {
    public static void main(String[] args) {
        
        TommyVecetti t = new TommyVecetti();
        t.Fire();
        t.Hit();
        t.Run();

    }
}
