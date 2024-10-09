// Thread Priorities: Each thread has a priority. Priorities are represented by a number between 1 and 10. In most cases, the thread scheduler schedules the threads according to their priority. But it is not guaranteed because it depends on JVM specification that which scheduling it chooses. Note that not only JVM a Java programmer can also assign the priorities of a thread explicitly in a Java program.

class OurThread extends Thread{

    public OurThread (String name){
        super(name);
    }

    @Override
    public void run(){
        while(true){
            System.out.println("Thread Running!!"+this.getName());
        }
    }

}

public class ThreadPriorities {
    public static void main(String[] args) {
        
        OurThread t1 = new OurThread("Angela Yu 1 Most Important!!");
        OurThread t2 = new OurThread("Angela Yu 2");
        OurThread t3 = new OurThread("Angela Yu 3");
        OurThread t4 = new OurThread("Angela Yu 4");
        OurThread t5 = new OurThread("Angela Yu 5");
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
