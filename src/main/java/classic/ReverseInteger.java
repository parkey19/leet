package classic;

import java.math.BigInteger;

/**
 * Created by parkey19 on 2019. 3. 6..
 */
public class ReverseInteger {
    public int reverse(int x) {
        if (x == Integer.MAX_VALUE || x ==Integer.MIN_VALUE) return 0;
        boolean isNagative = x<0;
        int val = Math.abs(x);

        String s = String.valueOf(val);
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(val % 10);
            val = val / 10;
        }

        BigInteger b = new BigInteger(sb.toString());

        BigInteger intMin = BigInteger.valueOf(Integer.MAX_VALUE-1);
        BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);

        if ((isNagative && b.compareTo(intMin)==1)
                || (!isNagative && b.compareTo(intMax)==1)) return 0;

        return isNagative ? -b.intValue():b.intValue();

    }
}
