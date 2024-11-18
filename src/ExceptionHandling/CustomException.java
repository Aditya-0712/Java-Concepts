package ExceptionHandling;

class MyNewException extends Exception{
    public MyNewException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try{
            int j=18/9;
            if (j==2){
                throw new MyNewException("Custom Exception");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught index e = " + e);
        }
        catch (MyNewException e){
            System.out.println("Caught custom exception e = " + e);
        }
        catch (Exception e) {
            System.out.println("Caught some e = " + e);
        }
    }
}
