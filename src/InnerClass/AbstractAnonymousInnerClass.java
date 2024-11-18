package InnerClass;

abstract class Testing{
    public abstract void display();
}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args){
        Testing obj = new Testing() {
            @Override
            public void display() {
                System.out.println("This is an anonymous inner class of class Testing");
            }
        };

        obj.display();

        //Here basically you are creating an anonymous inner class of class Testing, hence you are able to create
        //an object of an abstract class which generally is not allowed in java
    }
}
