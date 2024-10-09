// Constructors from Thread Class in Java:

class myThread extends Thread{
    
    public myThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("I am a Thread!");
    }

}

public class ConstructorsOverloading {
    public static void main(String[] args) {
        
        myThread obj = new myThread("Naman");
        obj.start();

    }
}
