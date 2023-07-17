package lessons;

import java.util.HashSet;
import java.util.Hashtable;

public class j39_Map {
    public static void main(String[] args) {
        Hashtable<String,String> map=new Hashtable<>();

        map.put("FirstClass","Tom");
        map.put("SecondClass","Jack");
        map.put("ThirdClass","Alize");
        map.put("FirstClass","Marina");
        System.out.println(map);

        Hashtable<String,String> map1=new Hashtable<>();

        map1.put("FirstClass","Tomas");
        map1.put("SecondClass","Jem");
        System.out.println(map1);
        System.out.println(map1);
        System.out.println(map);
        System.out.println("***");
        map.put("First", String.valueOf(map1));
        System.out.println(map);
        System.out.println("map.size() = " + map.size());
        System.out.println("map1.size() = " + map1.size());
        map1.clear();
        map.clear();
        System.out.println("map = " + map);
        System.out.println("map1 = " + map1);
    }
}
