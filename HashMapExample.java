import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String[]> myMap = new HashMap<String, String[]>();
        
        myMap.put("10001", new String[] {"Bondoy","Dioscoro","43"});
        myMap.put("10002", new String[] {"Bondoy","James","8"});

        String[] me = myMap.get("10001");

        for (String m : me) {
            System.out.println(m);

        }
    }
}
