// Question 1: Write a program to print "Good Morning" and "Welcome" continously on the screen in Java using Threads.

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Welcome!");
        }
    }
}

public class Question1{
    public static void main(String[] args) {
        
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        obj1.start();
        obj2.start();

    }
}