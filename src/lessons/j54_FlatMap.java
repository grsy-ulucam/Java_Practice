package lessons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class j54_FlatMap {
    public static void main(String[] args) throws IOException {

        Path text=Path.of("src/lessons/text");
        Stream<String>flow= Files.lines(text);
        //TASK 1--> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
        //First way
        System.out.println(Files.lines(text).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList()));
        //Second Way
        System.out.println(Files.lines(text).
                map(t->t.split(" ")).
                 flatMap(Arrays::stream).
                collect(Collectors.toSet()));
        //TASK 2 -->text.txt dosyasindaki tum kelimeleri natural order  print ediniz..
         Files.lines(text).
                 map(t->t.split(" ")).
                 flatMap(Arrays::stream) .
                 sorted().
                 forEach(System.out::println);
        //TASK 3 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println(Files.lines(text).
                map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.equals("basari")).
                count());
        //TASK 4 --> text.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println(Files.lines(text).
                map(t -> t.split("  ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("a")).
                count());
        //TASK 5 --> text.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println(Files.lines(text).
                map(t -> t.split("  ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("a")).
                collect(Collectors.toList()));
        //TASK 6 --> text.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println(Files.lines(text).
                map(t -> t.replaceAll("\\W", "").
                        replaceAll("\\d", "").
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().
                count());
        //TASK 7--> text.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println(Files.lines(text).
                map(t -> t.replaceAll("[.!,:)\\-]", " ").split(" ")).
                flatMap(Arrays::stream).
                distinct().
                count());
        //TASK 12 --> text.txt dosyasinda  farkli kelimeleri print ediniz
        System.out.println("\nTASK 12 --> haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
        Files.lines(text).
                map(t -> t.replaceAll("[.!,:)\\-]", "").
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().forEach(System.out::println);
    }
}
