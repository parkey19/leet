package java9.ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by parkey19 on 2019. 7. 31..
 */
public class Practice {

    public static <T extends Number> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;

        return values;
    }

    public static <E> void append2(List<? super E> destination, List<? extends E> source) {
        destination.addAll(source);
    }

    public static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;
    }

    public static <V> V doWork(Callable<V> c) {
        try {
            return c.call();
        } catch (Throwable ex) {
            Practice.throwAs(ex);
            return null;
        }
    }
    public static void main(String[] args) {

//        Double[] result = Practice.swap(0,1, 1, 2);
        Integer[] result = Practice.swap(0,1, 1,2,3,4);
        Double[] result2 = Practice.swap(0,1, 1.0d,2.0d,3.0d,4.0d);
        Arrays.stream(result).forEach(System.out::println);
        Arrays.stream(result2).forEach(System.out::println);


        ArrayList<Number> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Number> doubles = new ArrayList<>(Arrays.asList(1.0d, 2.0d, 3.0d, 4.0d));
        Practice.append2(integers, doubles);

        integers.stream().forEach(System.out::println);

        Ch6_2 ch6_2 = new Ch6_2();
        Ch6_2.StackEA<String> objectStackEA = ch6_2.new StackEA<>(10);
        objectStackEA.push("a");

        String pop = objectStackEA.pop();
        System.out.println(pop);

        Ch6_2.StackOA<String> objectStackOA = ch6_2.new StackOA<>(10);
        objectStackOA.push("b");

        String pop2 = objectStackOA.pop();
        System.out.println(pop2);


    }
}
