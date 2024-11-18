package Interfaces;

interface A{            //An interface is a class which contains only abstract methods
    int age = 10;
    String area = "pune";                //all declarations in an interface are static and final

    void display();
    void hello();
}

class B implements A{               //to inherit an interface use "implements" keyword
    @Override
    public void display() {
        System.out.println("Display() called");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}

public class InterfaceConcept {
    public static void main(String[] args){
        A obj = new B();

        obj.display();
        obj.hello();
        System.out.println(A.age + " " + A.area);
    }
}
