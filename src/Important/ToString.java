package Important;
import java.util.List;
import java.util.ArrayList;

class Temp{     //class Temp extends Object
    private final int x,y;

    public Temp(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString(){
        return "Value of x = " + this.getX() + "\nValue of y = " + this.getY();
    }
    //Overriding toString() method
}

public class ToString {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(){
            @Override
            public String toString(){
                return "I customised the output";
            }
        };
        //Overriding toString() in an anonymous inner class

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums);

        Temp obj = new Temp(70, 71);
        System.out.println(obj);
    }
}

//Now as you can see above, when I print(obj), it should print the address of it, but instead it printed what I wanted it to, but how?
//So actually what happens is that in Java, every single class (including CollectionAPI) extends "Object class"
//This Object class has a method named "public String toString()" which returns a String
//so whenever you print an object it is actually print(obj.toString()), but it is not shown
//So if I override toString() method I can control what to print when print(obj) is used
