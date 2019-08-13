package java9.ch08;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by parkey19 on 2019. 8. 13..
 */
public class Ch8dot1 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(
                Paths.get("alice.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        Stream<String> stringStream = words.stream()
                .filter(s -> {
                    System.out.println("filter call");
                    return true;
                })
                .limit(5);

        stringStream.forEach(System.out::println);

    }
}
