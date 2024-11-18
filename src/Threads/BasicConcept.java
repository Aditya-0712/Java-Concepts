package Threads;

class A extends Thread{
    public void run(){
        for (int i=0; i<100; i++){
            System.out.print("A");
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i=0; i<100; i++){
            System.out.print("B");
        }
    }
}

public class BasicConcept {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);
        //You can set priority to threads where 10 = highest priority and 1 = lowest

        obj1.start();
        obj2.start();

        //obj1 and obj2 will run paralelly
        //start() method basically creates a thread
        //Always remember that start() method will only invoke run() method of that class, if there's no run method it will not work
    }
}
