package lessons;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class j34_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("merve", "ayşe", "ali", "hasan"));
        System.out.println("list = " + list);
        list.add("veli");
        list.add(3, "zeki");
        System.out.println("list = " + list);
        list.remove(5);
        System.out.println("list = " + list);
        list.remove("hasan");
        list.add(null);
        System.out.println("list = " + list);
        List<String> list1 = new LinkedList(Arrays.asList("uğur", "mehmet"));
        list.addAll(list1);
        list.remove(null);
        System.out.println("list = " + list);
        for (String w : list) {
            System.out.print(w + " ");
        }
        System.out.println("*******");

            /*
        Task->
        Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bir linkedList create ediniz.
        Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"
        yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

         */
            LinkedList<String> l1 = new LinkedList<>(Arrays.asList("yakup", "javaCAN", "javaTAR", "Teykinay"));
            System.out.println("l1 = " + l1);
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a word");
            String research = scanner.next();

        if (l1.remove(research)){
            System.out.println("it's ok");
            System.out.println(l1);
        }else System.out.println("it's not ok");

    }
}
