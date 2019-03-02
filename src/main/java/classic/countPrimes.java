package classic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.sqrt;

/**
 * Created by parkey19 on 2019. 3. 2..
 */
public class countPrimes {
    public int countPrimes(int n) {
//        if (n == 1 || n == 2) return 0;
//        int result = 0;
        int count = 0;

        for (int i = 1; i < n; i++) {
//            int cnt = 0;
            if(isPrime(i)) count++;
//            for (int j = 2; j <= i; j++) {
//                if(cnt >1) break;
//                if (i % j == 0) {
//                    cnt++;
//                }
//            }
//            if (cnt == 1) {
////                primes.add(i);
//                result++;
//            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int[] isFilter(int num) {
        return IntStream.range(1, num)
                .filter(i -> i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
                .toArray();

    }
}
