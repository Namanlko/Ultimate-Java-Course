// Question 5: How do you get reference to the current thread in Java?

class Th extends Thread{

    public Th(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Thread Is Running...");
    }
}

public class Question5 {
    public static void main(String[] args) {
        
        Th obj = new Th("Angela Yu");
        System.out.println(obj.getPriority());
        System.out.println(obj.getName());
        
        // This is how we can get reference to the current Thread. 
        System.out.println(Thread.currentThread().getState());
        
    }
}
