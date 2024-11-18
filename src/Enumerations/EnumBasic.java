package Enumerations;

enum Status{
    Running, Failed, Success, Pending

    //These are not strings, these are called as named constants
}

public class EnumBasic {
    public static void main(String[] args){
        Status[] allStatuses = Status.values();

        for (Status s: allStatuses){
            System.out.println(s.ordinal() + " : " + s);
        }

        System.out.println("Your request is "+Status.Running);
    }
}
