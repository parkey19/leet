package java9.ch08;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by parkey19 on 2019. 8. 7..
 */
public class CollectingResults {
    public static Stream<String> noVowels(String filename) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(filename)),
                StandardCharsets.UTF_8);
        List<String> wordList = List.of(contents.split("\\PL+"));
        Stream<String> words = wordList.stream();
        return words.map(s -> s.replaceAll("[aeiouAEIOU]", ""));
    }

    public static <T> void show(String label, Set<T> set) {
        System.out.print(label + ": " + set.getClass().getName());
        System.out.println("["
                + set.stream().limit(10).map(Object::toString).collect(Collectors.joining(", "))
                + "]");
    }

    public static void main(String[] args) throws IOException {
        Iterator<Integer> iter = Stream.iterate(0, n -> n + 1).limit(10).iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        Object[] numbers = Stream.iterate(0, n -> n + 1).limit(10).toArray();
        System.out.println(numbers); // numbers는 Object[] 배열이라는 점을 주의하자.

        try {
            Integer number = (Integer) numbers[0]; // OK
            System.out.println("number: " + number);
            Integer[] numbers2 = (Integer[]) numbers; // 예외를 던진다.
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

        Integer[] numbers3 = Stream.iterate(0, n -> n + 1).limit(10).toArray(Integer[]::new);
        System.out.println(numbers3); // numbers3는 Integer[] 배열이라는 점을 주의하자.

        HashSet<String> noVowelHashSet = noVowels("alice.txt").collect(HashSet::new, HashSet::add,
                HashSet::addAll);
        show("noVowelHashSet", noVowelHashSet);

        Set<String> noVowelSet = noVowels("alice.txt").collect(Collectors.toSet());
        show("noVowelSet", noVowelSet);

        TreeSet<String> noVowelTreeSet = noVowels("alice.txt").collect(
                Collectors.toCollection(TreeSet::new));
        show("noVowelTreeSet", noVowelTreeSet);

        String result = noVowels("alice.txt").limit(10).collect(Collectors.joining());
        System.out.println(result);
        result = noVowels("alice.txt").limit(10).collect(Collectors.joining(", "));
        System.out.println(result);

        IntSummaryStatistics summary = noVowels("alice.txt").collect(
                Collectors.summarizingInt(String::length));
        double averageWordLength = summary.getAverage();
        double maxWordLength = summary.getMax();
        System.out.println("Average word length: " + averageWordLength);
        System.out.println("Max word length: " + maxWordLength);

        noVowels("alice.txt").limit(10).forEach(System.out::println);
    }
}
