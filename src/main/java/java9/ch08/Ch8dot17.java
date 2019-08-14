package java9.ch08;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by parkey19 on 2019. 8. 14..
 */
public class Ch8dot17 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(
                Paths.get("warandpeace.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        Long s1 = System.currentTimeMillis();
        Stream<String> stream = words.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(500);
        stream.forEach(System.out::println);
        Long result1 = System.currentTimeMillis() - s1;
        System.out.println("stream duration : " + result1);
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        Long s2 = System.currentTimeMillis();
        Stream<String> stream1 = words.parallelStream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(500);
        stream1.forEach(System.out::println);

        Long result2 = System.currentTimeMillis() - s2;
        System.out.println("parall duration : " + result2);



    }
}
