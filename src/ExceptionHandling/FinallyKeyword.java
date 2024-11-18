package ExceptionHandling;
import java.util.Scanner;

public class FinallyKeyword {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){   //whatever is declared in try() will get closed (sc.close()) after execution
            System.out.println("Enter number: ");
            sc.nextInt();
        } catch (Exception e) {
            System.out.println("Caught exception " + e);
        }
        finally {
            System.out.println("Whatever code in finally block will get executed regardless if an exception is caught or not");
        }
    }
}
