package InnerClass;

class A{
    private int temp;

    class B{
        public B(){
            System.out.println("B constructor called");
        }
    }

    static class C{
        public C(){
            System.out.println("C constructor called");
        }
    }
}

public class Inner {
    public static void main(String[] args){
        A obj = new A();
        A.B obj1 = obj.new B();                         //Create an object of B class which is non-static
        A.C obj2 = new A.C();                           //Create an object of C class which is static
        //You do not need an object of A to create an object of C as C is static
    }
}
