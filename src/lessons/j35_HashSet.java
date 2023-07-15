package lessons;

import java.util.*;

public class j35_HashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("muğla", "ısparta", "denizli", "manisa"));
        System.out.println("hashSet = " + hashSet);
        hashSet.add("aydın");
        System.out.println("hashSet = " + hashSet);
        hashSet.add("aydın");
        System.out.println("hashSet = " + hashSet);
        hashSet.remove("aydın");
        System.out.println("hashSet = " + hashSet);
        System.out.println(hashSet.contains("manisa"));
        System.out.println(hashSet.size());
        System.out.println("hashSet.hashCode() = " + hashSet.hashCode());
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println("hashSet.isEmpty() = " + hashSet.isEmpty());
          /*
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */
        String arr[] = {"Muharrem", "Umit", "Sinan", "Nihan"};

        LinkedHashSet<String> lhs = new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String> ts = new TreeSet<>(arrayListeCevir(arr));
        HashSet<String> hs = new HashSet<>(arrayListeCevir(arr));

        System.out.println(lhs);
        System.out.println(ts);
        System.out.println(hs);
        System.out.println("arrayListeCevir(arr) = " + arrayListeCevir(arr));

            /*
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "Germany" , "Brazil" ,"USA"
    ArrayListi yazdırınız.
     */
        HashSet<String> hashSet1 = new HashSet<>(Arrays.asList("Germany", "England", "South Africa", "Brazil", "USA"));
        HashSet<String> hashSet2 = new HashSet<>(Arrays.asList("Germany", "China", "Brazil", "France", "USA"));

        commonValues(hashSet1, hashSet2);

    }

    private static ArrayList<String> commonValues(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        hashSet1.retainAll(hashSet2);
        ArrayList<String> newList = new ArrayList<>(hashSet1);
        System.out.println(newList);
        return newList;
    }

    public static ArrayList<String> arrayListeCevir(String[] arr) {
        ArrayList<String> arLst = new ArrayList<>(List.of(arr));

        return arLst;
    }
}

