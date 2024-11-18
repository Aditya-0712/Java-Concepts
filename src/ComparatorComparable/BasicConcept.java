package ComparatorComparable;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class BasicConcept {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        Comparator<String> lengthComparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                    return 1;
                }
                else if (o1.length()==o2.length()){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        };

        arr.add("Hello!!");
        arr.add("My name is Aditya");
        arr.add("What is up");
        arr.add("We are on Earth");

        arr.sort(lengthComparator);

        System.out.println(arr);
    }
}
//This program will sort the arr according to the length of the string
//because I have customised the logic of comparator using an anonymous class.
//arr.sort(custom_comparator_name) <-- basically choosing the custom comparator we created