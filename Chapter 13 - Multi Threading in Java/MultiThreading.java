// Multi Threading in Java: Multi-Processing and Multi-Threading both are used to acheive Multi-Tasking. Concurrency is achieved by using Multi-Threading.

// Note: A Thread is a light weight where as process is heavy weight.

// For Example: A word processor can have one thread running in foreground as an editor and another in the background auto saving the document!

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I am Thread 1.");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I am Thread 2.");
        }
    }
}

public class MultiThreading{
    public static void main(String[] args) {
        
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        obj1.start();
        obj2.start();

    }
}

