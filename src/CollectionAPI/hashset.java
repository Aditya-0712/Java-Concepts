package CollectionAPI;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(123);
        set.add(67);
        set.add(1);
        set.add(59);
        set.add(45);
        set.add(32);

        System.out.println(set);
        //A set does not allow duplicate values

        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(32);
        sortedSet.add(123);
        sortedSet.add(67);
        sortedSet.add(1);
        sortedSet.add(59);
        sortedSet.add(45);
        sortedSet.add(32);
        System.out.println(sortedSet);
        //A TreeSet class always returns the sorted object
    }
}
