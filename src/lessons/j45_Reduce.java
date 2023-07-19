package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j45_Reduce {
    public static void main(String[] args) {
        List<Integer>text=new ArrayList<>(Arrays.asList(12,34,23,45,67,89,76));
        maxValue(text);
        System.out.println("***");
        sumValue(text);
        System.out.println("***");
        doubleValue(text);
        System.out.println("***");
        minValue(text);
        System.out.println("***");
        minValue(text);
        System.out.println("***");
    }
    // Task : List'teki elemanlardan en kucugunu 2 farklı yontem ile print ediniz
    private static void minValue(List<Integer> text) {
        System.out.println(text.stream().reduce(Math::min));
        System.out.println(text.stream().reduce(Integer::min));
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    private static void doubleValue(List<Integer> text) {
        System.out.println(text.
                stream().
                filter(j42_LambdaExpression::ciftMi).
                reduce(Math::multiplyExact));
    }

    // Task : List'teki tum elemanlarin toplamini print ediniz.
    private static void sumValue(List<Integer> text) {
        System.out.println(text.
                stream().
                reduce(Integer::sum));
    }

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz.
    private static void maxValue(List<Integer> text) {
        System.out.println(text.
                stream().
                filter(j42_LambdaExpression::ciftMi).
                map(t->t*t).
                reduce(Integer::max));
    }
}
