package java9.ch08;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by parkey19 on 2019. 8. 2..
 */
public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice.txt")),
                StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        //병렬보다 순차가 빠름... 데이터가 적은듯
        long t = System.currentTimeMillis();

        long count = 0;
        for (String w : words) {
            if (w.length() > 12)
                count++;
        }
        System.out.println(count);
        System.out.println(System.currentTimeMillis()-t);

        long t2 = System.currentTimeMillis();
        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);
        System.out.println(System.currentTimeMillis()-t2);

        long t3 = System.currentTimeMillis();
        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);
        System.out.println(System.currentTimeMillis()-t3);
    }
}
