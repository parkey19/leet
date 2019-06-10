package basic.ch2;

public class PrimeNumber {

    public static void main(String[] args) {
        int counter = 0;

        for (int n = 2; n < 10; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) {
                    break;
                }
            }
            if (n == i) {
                System.out.println(n);
            }

        }
    }
}
