package lessons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class j53_TextRead {

    public static void main(String[] args) throws IOException {
        //TASK 01 --> text dosyasini okuyunuz.(Console'a print ediniz.)
        Path text = Path.of("src/lessons/text");
        Stream<String> flow = Files.lines(text);
        flow.forEach(System.out::println);

        System.out.println("\n ***");

        //TASK 02 --> text.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print ediniz.)
        Files.lines(Paths.get("src/lessons/text")).
                map(String::toUpperCase).
                forEach(System.out::println);

        System.out.println("\n ***");

        //TASK 03 --> text dosyasindaki ilk satiri kucuk harflerle print ediniz..
        Files.lines(Paths.get("src/lessons/text")).
                map(String::toLowerCase).
                limit(1).
                forEach(System.out::println);

        System.out.println("\n ***");

        //TASK 04 --> text dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println(Files.lines(Paths.get("src/lessons/text")).
                map(String::toLowerCase).
                filter(t -> t.contains("basari")).
                count());
    }
}
