package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class j33_Iterators {
       /*
        task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
         */
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(13,14,25,22,33,99,88));
        ListIterator<Integer>top=list.listIterator();
        while(top.hasNext()){
            top.next();
        }
        while (top.hasPrevious()){
            int a=top.previous();
            if (a%2==1){
                top.set(a*a);
            }else top.remove();
        }
        System.out.println("list = " + list);
        System.out.println("*****");

         /*  task->
        Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
        elementleri silip print eden code create ediniz
        (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
	    Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
	    output: [23,40]
         */
          ArrayList<Integer>listNo=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        System.out.println("listNo = " + listNo);
        ListIterator<Integer>num=listNo.listIterator();
          while (num.hasNext()){
              int a =num.next();
              if (a >=40 || a<=20){
                  num.remove();
              }
          }
        System.out.println("listNo = " + listNo);
    }
}
