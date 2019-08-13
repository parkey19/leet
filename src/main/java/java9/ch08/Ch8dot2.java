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
public class Ch8dot2 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(
                Paths.get("warandpeace.txt")), StandardCharsets.UTF_8);
//                Paths.get("alice.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        Long s1 = System.currentTimeMillis();
        Long totalCountS = words.stream().count();
        Long result1 = System.currentTimeMillis() - s1;
        System.out.println("stream : "+ totalCountS + " duration : " + result1);

        Long s2 = System.currentTimeMillis();
        Long totalCountP = words.parallelStream().count();
        Long result2 = System.currentTimeMillis() - s2;
        System.out.println("parallelStream : "+ totalCountP + " duration : " + result2);
    }
}
