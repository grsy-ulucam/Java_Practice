package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class j49_Limit {
    public static void main(String[] args) {

        List<String>text=new ArrayList<>(Arrays.asList("FRANCE","GERMANY","SPAIN","TURKEY","CHINA"));
          limit(text);
        System.out.println("***");
        limit1(text);

    }
    // Task : Karakter sayisi en küçük elemani yazdiriniz.
    private static void limit1(List<String> text) {
        text.
                stream().
                sorted(Comparator.comparing(String::length)).
                limit(2).
                forEach(System.out::println);

    }

    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    private static void limit(List<String> text) {
        text.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1).
                forEach(System.out::println);
    }
}
