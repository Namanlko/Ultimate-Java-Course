// There are two ways to create a thread in Java.
// 1) By extending Thread Class
// 2) By implementing Runnable Interface

// Let's undersatnd how to implement Multi-Threading in Java with the help of Runnable Interface.

class MyThreadClass1 implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.println("I am Thread 1 of My Thread Class 1.");
        }
    }
}

class MyThreadClass2 implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.println("I am Thread 2 of My Thread Class 2.");
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
    
       MyThreadClass1 bullet1 = new MyThreadClass1();
       Thread gun1 = new Thread(bullet1);

       MyThreadClass2 bullet2 = new MyThreadClass2();
       Thread gun2 = new Thread(bullet2);

       gun1.start();
       gun2.start();

    }
}
