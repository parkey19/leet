package classic;

/**
 * Created by parkey19 on 2019. 9. 29..
 */
public class ClimbStairs {
    public static int climb(int n) {
        int[] d = new int[n+1];
        d[1] = 1;
        d[2] = 2;
        for (int i = 3; i <= n; i++) {
           d[i] = d[i-1] + d[i-2];
        }
        return d[n];
    }

    public static void main(String[] args) {
        int count = ClimbStairs.climb(5);
        System.out.println(count);
    }
}
