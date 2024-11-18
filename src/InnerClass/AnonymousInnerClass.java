package InnerClass;

class Temp{
    public void display(){
        System.out.println("Displaying class Temp");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){
        Temp obj = new Temp(){
            public void display(){
                System.out.println("Displaying anonymous class");
            }
        };

        obj.display();
        //run the program and see which display() is executed
    }
}
