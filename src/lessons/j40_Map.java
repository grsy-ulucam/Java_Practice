package lessons;

import java.util.TreeMap;

public class j40_Map {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(103, "Kevser");
        tm.put(101, "Uğur");
        tm.put(105, "Emine");
        tm.put(102, "Enise");
        tm.put(104, "Fatih");

        System.out.println("tm = " + tm);
        tm.put(106,"Gürsoy");
        System.out.println("tm = " + tm);
        System.out.println("tm.lastKey() = " + tm.lastKey());
        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());
        System.out.println("tm.keySet() = " + tm.keySet());
        System.out.println("tm.containsKey(102) = " + tm.containsKey(102));
        System.out.println("tm.get(102) = " + tm.get(102));
        System.out.println("tm.containsValue(\"Emine\") = " + tm.containsValue("Emine"));
        System.out.println("tm.size() = " + tm.size());
        tm.clear();
        System.out.println("tm.isEmpty() = " + tm.isEmpty());
        System.out.println("tm = " + tm);
        System.out.println("tm.size() = " + tm.size());
    }
}
