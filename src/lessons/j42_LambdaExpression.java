package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j42_LambdaExpression {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 23, 45, 67, 89, 45, 23, 99));
        System.out.println(numbers);

        sayı1(numbers);
        System.out.println("\n   ***   ");
        sayı2(numbers);
        System.out.println("\n   ***   ");
        sayı3(numbers);
        System.out.println("\n   ***   ");
        sayı4(numbers);

    }

    private static void sayı4(List<Integer> numbers) {
        numbers.
                stream().
                forEach(j42_LambdaExpression::yazdır);
    }

    public static void yazdır(int a) {
        System.out.print(a + " ");
    }

    private static void sayı3(List<Integer> numbers) {
        numbers.
                stream().
                forEach(System.out::print);
    }

    private static void sayı2(List<Integer> numbers) {
        numbers.
                stream().
                forEach(t -> System.out.print(t + " "));
    }

    private static void sayı1(List<Integer> numbers) {
        for (Integer w : numbers) {
            System.out.print(w + " ");
        }
    }
     public  static  boolean ciftMi(int X){
        return  X%2==0;
     }
    public  static  boolean tekMi(int X){
        return  X%2==1;
    }


}
