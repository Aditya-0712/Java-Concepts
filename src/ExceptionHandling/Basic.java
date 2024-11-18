package ExceptionHandling;

public class Basic {
    public static void main(String[] args) {
        int i=0;
        int j=18;

        try{
            j=j/i;
        } catch (Exception e) {
            System.out.println("Something went wrong");
            throw new RuntimeException(e);
        }
        //if not used try catch block, code below will not run

        System.out.println("This line is running");
    }
}
