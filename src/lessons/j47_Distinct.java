package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class j47_Distinct {
    public static void main(String[] args) {

        List<String> text = new ArrayList<>(Arrays.asList("ali", "veli", "meryem", "ali", "mehmet"));

        distinct01(text);
        System.out.println("***");
        distinct02(text);
        System.out.println("***");
        distinct03(text);
        System.out.println("***");
        distinct04(text);
        System.out.println("***");
        distinct05(text);


    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    private static void distinct05(List<String> text) {
        text.
                stream().
                map(t -> t.length() * t.length()).
                filter(j42_LambdaExpression::ciftMi).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(j42_LambdaExpression::yazdır);
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    private static void distinct04(List<String> text) {
        text.
                stream().
                sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).
                        reversed()).
                forEach(t -> System.out.print(t + " "));
    }

    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    private static void distinct03(List<String> text) {

        text.
                stream().
                sorted(Comparator.
                        comparing(String::length)).
                forEach(t -> System.out.print(t + " "));


    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    private static void distinct02(List<String> text) {
        text.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().forEach(t -> System.out.print(t + " "));

    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    private static void distinct01(List<String> text) {
        text.
                stream().
                distinct().
                forEach(t -> System.out.print(t + " "));
    }
}
