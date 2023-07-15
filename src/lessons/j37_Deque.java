package lessons;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class j37_Deque {
    public static void main(String[] args) {

        Deque<Integer>d1=new LinkedList<>(Arrays.asList(1,34,56,78,89));
        System.out.println(d1);
        System.out.println("d1.getFirst() = " + d1.getFirst());
        System.out.println("d1.getLast() = " + d1.getLast());
        System.out.println("d1.removeLast() = " + d1.removeLast());
        System.out.println("d1.remove() = " + d1.remove(56));
        System.out.println(d1);
        System.out.println("d1.peekFirst() = " + d1.peekFirst());
        System.out.println("d1.pollFirst() = " + d1.pollFirst());
        System.out.println("d1.contains(78) = " + d1.contains(78));
        System.out.println("d1.remove() = " + d1.remove());
        d1.clear();
        System.out.println("d1 = " + d1);
        System.out.println("d1.isEmpty() = " + d1.isEmpty());
    }
}
