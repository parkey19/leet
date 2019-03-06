package classic;

/**
 * Created by parkey19 on 2019. 3. 6..
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean isNagative = x<0;
        int val = Math.abs(x);
        String s = String.valueOf(val);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(val % 10);
            val = val / 10;
        }

//        if ()
        Double.valueOf(sb.toString());
        int result = Integer.parseInt(sb.toString());
        return isNagative ? -result:result;
        //-2147483648 2147483647
    }
}
