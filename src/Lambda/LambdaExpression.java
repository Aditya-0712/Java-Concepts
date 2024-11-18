package Lambda;

@FunctionalInterface
interface Temp{
    void display(int i);
}

@FunctionalInterface
interface A{
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args){
        Temp obj = i -> System.out.println("i = " + i);         //lambda expression
        obj.display(5);

        //The above lambda expression is basically replacement for overriding display method using an anonymous inner class
        //as follows
//        Temp obj = new Temp() {
//            @Override
//            public void display(int i) {
//                System.out.println("i = " + i);
//            }
//        };


        //Always remember that lambda expression can only be used with a functional interface
        //Another example of lambda


        A obj1 = (a, b) -> a+b;
        System.out.println(obj1.add(1,2));
    }
}
