package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j43_Filter {
    public static void main(String[] args) {

        List<Integer>data=new ArrayList<>(Arrays.asList(12,23,45,56,78,99));
          text1(data);
        System.out.println("\n  ***");
          text2(data);
        System.out.println("\n  ***");
        text3(data);
        System.out.println("\n  ***");
        text4(data);
        System.out.println("\n  ***");
        text5(data);
        System.out.println("\n  ***");
        text6(data);
        System.out.println("\n  ***");
        text7(data);
        System.out.println("\n  ***");
        text8(data);
    }

    private static void text8(List<Integer> data) {
        data.
                stream().
                filter(j42_LambdaExpression::tekMi).
                forEach(j42_LambdaExpression::yazdır);
    }

    private static void text7(List<Integer> data) {
        data.
                stream().
                filter(j42_LambdaExpression::ciftMi).
                forEach(j42_LambdaExpression::yazdır);
    }

    private static void text6(List<Integer> data) {

        data.
                stream().
                filter(t->t%2==0|| t>55).
                forEach(j42_LambdaExpression::yazdır);
    }

    private static void text5(List<Integer> data) {
        data.
                stream().
                filter(j42_LambdaExpression::ciftMi).
                filter(t->t<45).
                forEach(j42_LambdaExpression::yazdır);
    }

    private static void text4(List<Integer> data) {
        data.
                stream().
                filter(j42_LambdaExpression::ciftMi).
                forEach(j42_LambdaExpression::yazdır);
    }

    private static void text3(List<Integer> data) {
        data.
                stream().
                filter(t->t%2==0).
                forEach(j42_LambdaExpression::yazdır);
    }
    private static void text2(List<Integer> data) {
        for (Integer s:data) {
            if (s%2==0){
                System.out.print(s+" ");
            }
        }
    }
    private static void text1(List<Integer>data) {
        for (Integer w:data) {
            System.out.print(w+" ");
        }
    }

}
