// Java Thread Methods:

// 1) Join Method in Java: The join() method in Java allows one thread to wait until the execution of some other specified thread is completed.

// 2)  Sleep Method: The sleep() method in Java is useful to put a thread to sleep for a specified amount of time. When we put a thread to sleep, the thread scheduler picks and executes another thread in the queue.

class NewThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread 1 Running...");
        }
    }
}

class NewThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread 2 Running...");
        }
    }
}

public class JavaThreadMethods {
    public static void main(String[] args) {
        
        // Let's Understand Thread Join Method:

        NewThread1 t1 = new NewThread1();
        NewThread2 t2 = new NewThread2();

        t1.start();

        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        t2.start();

        // Let's Understand Thread Sleep Method:

        NewThread1 t3 = new NewThread1();
        NewThread2 t4 = new NewThread2();
        
        t3.start();

        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }

        t4.start();

    }
}
