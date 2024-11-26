import java.util.ArrayList;
import java.util.HashMap;

public class Hello {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);



        ArrayList<String> keys = new ArrayList<>(customers.keySet());
        for (String key : keys) {
            System.out.println("Key: "  + key + ": " + customers.get(key));
        }
    }
}
