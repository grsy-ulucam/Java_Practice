package lessons;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class j36_Queue {
    public static void main(String[] args) {

        Queue<String>q1=new LinkedList<>(Arrays.asList("weast","east","north","south"));
        System.out.println("q1 = " + q1);
         q1.add("middle");
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);
        q1.remove("north");
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        q1.peek();
        System.out.println(q1);
        q1.element();
        System.out.println(q1);
        System.out.println("q1.size() = " + q1.size());
        q1.clear();
        System.out.println("q1.isEmpty() = " + q1.isEmpty());

    }
}
