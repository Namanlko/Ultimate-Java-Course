// There are two ways to create a thread in Java.
// 1) By extending Thread Class
// 2) By implementing Runnable Interface

// Let's undersatnd how to implement Multi-Threading in Java with the help of Thread Class

class ThreadClass1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I am Thread 1 of Thread Class 1.");
        }
    }
}

class ThreadClass2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I am Thread 2 of Thread Class 2.");
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        
        ThreadClass1 obj1 = new ThreadClass1();
        ThreadClass2 obj2 = new ThreadClass2();

        obj1.start();
        obj2.start();

    }
}
