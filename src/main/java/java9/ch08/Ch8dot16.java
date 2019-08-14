package java9.ch08;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Created by parkey19 on 2019. 8. 14..
 */
public class Ch8dot16 {
    public static void main(String[] args) {
        //5848961698036841689418631330196584896169803684168941
        BigInteger bigInteger = new BigInteger("1000000000000000000000000000000000000000000000000000");
        Stream<BigInteger> iterate = Stream.iterate(bigInteger, n -> n.add(BigInteger.ONE));

        Stream<BigInteger> iterate2 = Stream.iterate(bigInteger, n -> n.add(BigInteger.ONE)).parallel();

        Long s1 = System.currentTimeMillis();
        iterate.filter(b -> b.isProbablePrime(1)).limit(500).forEach(System.out::println);
        Long result1 = System.currentTimeMillis() - s1;
        System.out.println("stream duration : " + result1);
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        Long s2 = System.currentTimeMillis();
        iterate2.filter(b -> b.isProbablePrime(1)).limit(500).forEach(System.out::println);
        Long result2 = System.currentTimeMillis() - s2;
        System.out.println("parall duration : " + result2);


    }
}
