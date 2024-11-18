package Threads;

class E implements Runnable{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("E");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Caught e");
            }
        }
    }
}

class F implements Runnable{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("F");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Caught e");
            }
        }
    }
}

public class RunnableThreads {
    public static void main(String[] args) {
        Runnable obj1 = new E();
        Runnable obj2 = new F();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //Basically using threads via Runnable class
        //There is no difference in using Thread or Runnable
    }
}
