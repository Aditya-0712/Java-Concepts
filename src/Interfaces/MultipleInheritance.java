package Interfaces;

//Always remember the following for inheritance:
//class ---> class: extends
//interface --> interface: extends
//class --> interface: implements

interface X{
    void display();
    void calc();
}

interface Y{
    void show();
    void calc();
}

class Mult implements X,Y{
    @Override
    public void display() {
        System.out.println("Display called");
    }

    @Override
    public void show() {
        System.out.println("show called");
    }

    @Override
    public void calc(){
        System.out.println("calc called");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Mult obj = new Mult();
        obj.display();
        obj.show();
        obj.calc();
    }
}
