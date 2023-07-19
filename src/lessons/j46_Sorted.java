package lessons;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class  j46_Sorted {
    public static void main(String[] args) {
        List<Integer> text = new ArrayList<>(Arrays.asList(1, 23, 4, 5, 67, 8, 9));
        sort1(text);
        System.out.println("***");
        sort2(text);

    }


    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz
    private static void sort2(List<Integer> text) {
        text.
                stream().
                filter(t -> t % 2 == 1).
                map(t -> t * t).sorted(Comparator.reverseOrder()).
                forEach(j42_LambdaExpression::yazdır);
    }

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    private static void sort1(List<Integer> text) {
        text.
                stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                sorted().forEach(t -> System.out.print(t + " "));
    }

}
