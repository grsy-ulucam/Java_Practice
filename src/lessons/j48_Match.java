package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j48_Match {

    public static void main(String[] args) {

        List<String> text = new ArrayList<>(Arrays.asList("ali", "mary", "veli", "tom", "meryem", "xax"));
        match(text);
        System.out.println("***");
        match1(text);
        System.out.println("***");
        match2(text);

    }

    // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz
    private static void match2(List<String> text) {
        System.out.println("text.stream().anyMatch(t->t.toLowerCase().endsWith(\"x\")) = " + (text.stream().anyMatch(t -> t.toLowerCase().endsWith("x"))?"it is ok":"it is not ok"));
    }

    // Task : List elemanlarinin "m" ile baslamasını kontrol ediniz.->noneMatch
    private static void match1(List<String> text) {
        System.out.println("text.stream().noneMatch(t->t.startsWith(\"m\")) = " + text.stream().noneMatch(t -> t.toLowerCase().startsWith("m")));

    }

    // Task : List elemanlarinin karakter sayisini 4 ve 4 'den az olma durumunu kontrol ediniz.->
    private static void match(List<String> text) {
        boolean result = text.stream().allMatch(t -> t.length() <= 4);
        if (result) {
            System.out.println("It is ok");
        } else System.out.println("Tt is not ok");

        System.out.println(text.stream().allMatch(t -> t.length() <= 4));
    }
}
