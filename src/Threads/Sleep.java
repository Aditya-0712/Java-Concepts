package Threads;

class C extends Thread{
    public void run(){
        for (int i=0; i<100; i++){
            System.out.print("C");
            try {
                Thread.sleep(10);   //wait for 10 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Caught");
            }
        }
    }
}

class D extends Thread{
    public void run(){
        for (int i=0; i<100; i++){
            System.out.print("D");
            try {
                Thread.sleep(10);   //wait for 10 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Caught");
            }
        }
    }
}

public class Sleep {
    public static void main(String[] args) {
        C obj1 = new C();
        D obj2 = new D();

        obj1.start();
        obj2.start();


        //After running the program you will see that both threads are running in parallel
        //Thread.sleep(10) basically tells the scheduler to wait for 10 milliseconds, till then execute other threads
    }
}
