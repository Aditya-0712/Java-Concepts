package Abstraction;

abstract class Car{
    protected int temp;                         //just to understand concept
    public abstract void drive();
    public abstract void playMusic();

    public Car(int temp){
        this.temp = temp;
    }
}

class WagonR extends Car{
    @Override
    public void drive() {
        System.out.println("Driving....");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music....");
    }

    WagonR(int temp){
        super(temp);                //Basically calls the parameterized constructor of the parent class
                                    //If used only super() or if not used super() method, then it will call default constructor of the parent class if there exists one
    }
}

public class Abstraction{
    public static void main(String[] args){
        WagonR obj = new WagonR(69);
        obj.drive();
        obj.playMusic();
    }

    //Remember that you cannot create an object of an abstract class
    //Example: Car obj1 = new Car() is not valid and will give error
}


