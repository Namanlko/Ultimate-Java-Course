// Question 2: Add a sleep method in Welcome Thread of Question 1 to delay its execution for 200ms.

class Welcome extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Welcome!");
        }
    }
}

class GoodMorning extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Welcome obj1 = new Welcome();
        GoodMorning obj2 = new GoodMorning();

        obj1.start();
        try{
            Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        obj2.start();
    }
}
