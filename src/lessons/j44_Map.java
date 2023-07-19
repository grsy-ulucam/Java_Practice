package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j44_Map {
    public static void main(String[] args) {

        List<Integer>sayı=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        call(sayı);
        System.out.println("***");
        call1(sayı);
        System.out.println("***");
        call2(sayı);
    }

    private static void call2(List<Integer> sayı) {
        sayı.stream().filter(t->t%2==0).map(t->Math.sqrt(t)). forEach(t-> System.out.print(t+" "));
    }

    private static void call1(List<Integer> sayı) {
        sayı.
                stream().
                filter(t->t%2==1).
                map(t->Math.pow(t,3)+1).
                forEach(t-> System.out.print(t+" "));

    }

    private static void call(List<Integer> sayı) {
        sayı.
                stream().
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));
    }

}
