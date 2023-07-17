package lessons;

import java.util.HashMap;
import java.util.Map;

public class j38_Map {

    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();

        map.put("Turkey","Ankara");
        map.put("France","Paris");
        map.put("Germany","Berlin");
        map.put("Russian","Moskova");
        map.put("Japan","Tokyo");
        System.out.println(map);
        map.remove("France","Paris");
        System.out.println(map);
        map.replace("Turkey","Istanbul");
        System.out.println(map);
        System.out.println("map.get(\"Germany\") = " + map.get("Germany"));
        System.out.println("map.entrySet() = " + map.entrySet());
        for (Map.Entry<String,String>e :map.entrySet()) {
            System.out.println("e.getValue() = " + e.getValue());
        }
        System.out.println("map.containsValue(\"Tokya\") = " + map.containsValue("Tokyo"));
        System.out.println("map.containsKey(\"Japan\") = " + map.containsKey("Japan"));
        System.out.println("map.isEmpty() = " + map.isEmpty());
        System.out.println("map.size() = " + map.size());
        map.clear();
        System.out.println("map = " + map);
        System.out.println("map.size() = " + map.size());






    }
}
