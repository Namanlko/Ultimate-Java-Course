// Question 4: How do you get state of a given thread in java?

class NewThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is Running!!");
    }
}

public class Question4 {
    public static void main(String[] args) {

        NewThread t1 = new NewThread();
        // NEW
        System.out.println(t1.getState());
        
        t1.start();
        // RUNNABLE:
        System.out.println(t1.getState());
        
    }
}
