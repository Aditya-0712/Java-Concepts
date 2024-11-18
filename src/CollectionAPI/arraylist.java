package CollectionAPI;
import java.util.ArrayList;
import java.util.Collection;

public class arraylist {
    public static void main(String[] args) {
        Collection<Integer> obj = new ArrayList<>(){
            @Override
            public String toString(){
                return "Customised";
            }
        };

        obj.add(1);
        obj.add(2);
        obj.add(3);
        System.out.println(obj);
    }
}
