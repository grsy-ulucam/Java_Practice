package lessons;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class j51_Object {
    public static void main(String[] args) {
        Universite u01 = new Universite("Bogazici", "Matematik", 571, 73);
        Universite u02 = new Universite("Istanbul", "Matematik", 622, 77);
        Universite u03 = new Universite("Marmara", "Hukuk", 1453, 52);
        Universite u04 = new Universite("Itu", "uçak muh.", 333, 63);
        Universite u05 = new Universite("Yıldız Teknik", "Gemi ", 216, 55);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        task1(unv);
        System.out.println("\n ***");
        task2(unv);
        System.out.println("\n ***");
        task3(unv);
        System.out.println("\n ***");
        task4(unv);
        System.out.println("\n ***");
        task5(unv);
        System.out.println("\n ***");
        task6(unv);
        System.out.println("\n ***");
        task7(unv);
        System.out.println("\n ***");
        task8(unv);
        System.out.println("\n ***");
    }

    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    private static void task8(List<Universite> unv) {
        unv.stream().filter(t -> t.getOgrcSayisi() > 333).mapToDouble(t -> t.getNotOrt()).forEach(t -> System.out.println(t + " "));

    }

    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    private static int task7(List<Universite> unv) {
        int result = unv.stream().filter(t -> t.getNotOrt() > 63).mapToInt(t -> t.getNotOrt()).sum();
        System.out.println(result);
        return result;
    }

    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    private static List<Universite> task6(List<Universite> unv) {
        Object text = unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1).collect(Collectors.toList());
        System.out.println(text);
        return (List<Universite>) text;

    }

    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    private static void task5(List<Universite> unv) {
        unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).skip(2).forEach(t -> System.out.println(t + " "));
    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    private static void task4(List<Universite> unv) {
        System.out.println("unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).collect(Collectors.toList()) = " + unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).collect(Collectors.toList()));
    }

    //task 03-->universite'lerde herhangi birinde "hukuk" olup olmadigini  kontrol eden pr create ediniz.
    private static void task3(List<Universite> unv) {
        System.out.println("unv.stream().anyMatch(t->t.getBolum().toLowerCase().contains(\"hukuk\")) = " + unv.stream().anyMatch(t -> t.getBolum().toLowerCase().contains("hukuk")));
    }

    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    private static void task2(List<Universite> unv) {
        System.out.println("unv.stream().allMatch(t -> t.getOgrcSayisi() < 110) = " + unv.stream().allMatch(t -> t.getOgrcSayisi() < 110));
    }

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    private static void task1(List<Universite> unv) {
        System.out.println("unv.stream().allMatch(t->t.getNotOrt()>74) = " + unv.stream().allMatch(t -> t.getNotOrt() > 51));
    }
}
