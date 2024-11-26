import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;



public class Hi {
    public static void main(String[] args) {

         // hashset
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");

        System.out.println(set);

        set.add("apple");
        System.out.println(set);

        set.remove("apple");
        System.out.println("set sau khi remove: " + set);


          //linked hashset
//        Set<String> set = new LinkedHashSet<>();
//        set.add("apple");
//        set.add("banana");
//
//        System.out.println(set);
//
//        set.add("apple");
//        System.out.println(set);


//          //tree set
//        TreeSet<String> set = new TreeSet<>();
//        set.add("banana");
//        set.add("apple");
//
//
//        System.out.println(set);
//
//        set.add("banana");
//        System.out.println(set);

    }
}