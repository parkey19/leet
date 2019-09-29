package classic;

/**
 * Created by parkey19 on 2019. 9. 29..
 */
public class HammingDistance {

    public static int haming(int a, int b) {
        int xor = a ^ b;
        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            cnt += (xor >> i) & 1;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int haming = HammingDistance.haming(2, 3);
        System.out.println(haming);
    }
}
