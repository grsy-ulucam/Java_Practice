package lessons;

import java.util.*;

public class j32_Iterators {
    public static void main(String[] args) {

        List<String>list=new ArrayList<>(Arrays.asList("ALİ", "VELİ", "CANAN"));

        System.out.println(list);

        Iterator<String>newList=list.iterator();

        while (newList.hasNext()){
            newList.next();
            newList.remove();
        }

        System.out.println(list);

       List<String>list1=new ArrayList<>(Arrays.asList("ALİ","CANAN","VELİ"));

        System.out.println(list1);

        Iterator<String>newList1=list1.listIterator();

        while (newList1.hasNext()) {

           ((ListIterator<String>) newList1).set(newList1.next() + " :-) ");
        }

        System.out.println(list1);

        System.out.println("********");

        List<String>list2 = new ArrayList<>(Arrays.asList("Serhat ", "Yakup", "Mustafa", "Nazlı"));
        System.out.println(list2);

        ListIterator<String>newList2=list2.listIterator();

            while (newList2.hasNext()){
                newList2.set(newList2.next().toUpperCase().charAt(0)+"****");
               // newList2.add(list1.toString());
            }
        System.out.println("list2 = " + list2);
    }
}
