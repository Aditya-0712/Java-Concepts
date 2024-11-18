package Interfaces;

interface Normal{
    void A();
    void B();

    //Interface with more than 1 abstract method is called Normal Interface
}

@FunctionalInterface            //Annotation used for functional interface or SAM interface
interface FunctionalOrSam{
    void C();

    //An interface with only 1 abstract method is called Functional or Single Abstract Method(SAM) Interface
}

interface Marker{
    //Interface with no abstract methods is called as Marker Interface
}

class Ok implements Normal, FunctionalOrSam, Marker{
    @Override
    public void A() {
        System.out.println("A");
    }

    @Override
    public void B() {
        System.out.println("B");
    }

    @Override
    public void C() {
        System.out.println("C");
    }
}

public class TypesOfInterfaces {
    public static void main(String[] args){
        Ok obj = new Ok();
        obj.A();
        obj.B();
        obj.C();
    }
}
