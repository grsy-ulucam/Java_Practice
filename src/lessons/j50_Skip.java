package lessons;

import java.util.*;

public class j50_Skip {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        skip(text);
        System.out.println("***");
        skip1(text);

    }

    // Task : list elemanlarini son harfine göre siralayıp son iki eleman hariç kalan elemanlari print ediniz
    private static void skip1(List<String> text) {
        text.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                skip(3).
                forEach(t -> System.out.print(t + " "));

    }

    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print ediniz.
    private static void skip(List<String> text) {
        text.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                skip(2).
                forEach(t -> System.out.print(t + " "));
    }

}
