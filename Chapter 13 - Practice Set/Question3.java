// Question 3: Demonstrate getPriority() and setPriority() methods in Java Threads.

// Note: We have to set the priority wthin the range of 1 to 10.

class OurThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 1 is Running!");
    }
}

class OurThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 2 is Running!");
    }
}

public class Question3 {
    public static void main(String[] args) {
        
        OurThread1 obj1 = new OurThread1();
        OurThread2 obj2 = new OurThread2();

        obj1.setPriority(10);
        obj2.setPriority(5);

        System.out.println("Priority of Thread 1 is "+obj1.getPriority());
        System.out.println("Priority of Thread 2 is "+obj2.getPriority());

        obj1.start();
        obj2.start();

    }
}
