package lessons;

import java.util.stream.IntStream;

public class j52_Stream_iterator {
    int x;

    public static void main(String[] args) {

        task1(10);
        System.out.println("\n ***");
        task2(10);
        System.out.println("\n ***");
        task3(10);
        System.out.println("\n ***");
        task4(5);
        System.out.println("\n ****");
        task5(5);
        System.out.println("\n ****");
        task6(2);

    }

    //TASK 06 --> 2'nin ilk x kuvvetini ekrana yazdiran code  create ediniz.
    private static void task6(int x) {
        IntStream.
                iterate(2, t -> t * 2).
                limit(x).
                forEach(t -> System.out.println(t + " "));
    }

    //TASK 05 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    private static void task5(int x) {
        System.out.println(IntStream.
                iterate(1, t -> t + 2).
                limit(x).
                sum());


    }


    //TASK 04 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.
    private static void task4(int x) {
        System.out.println(IntStream.
                iterate(2, t -> t + 2).
                limit(x).
                sum());

    }

    //TASK 03 --> 1'den x'e kadar cift tamsayilari toplayan bir code create ediniz
    private static void task3(int x) {
        System.out.println(IntStream.
                range(1, x).
                filter(t -> t % 2 == 0).
                sum());
    }
    //TASK 01_02--> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.

    private static void task2(int x) {
        System.out.println(IntStream.
                range(1, x + 1).
                sum());
    }

    private static void task1(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
