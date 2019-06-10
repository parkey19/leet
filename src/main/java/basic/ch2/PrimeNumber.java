package basic.ch2;

public class PrimeNumber {

    public static void main(String[] args) {
        brutePrime();
        upgradePrime();
    }

    static void brutePrime(){
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

    static void upgradePrime(){
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 3; n <= 10; n+=2) {
            int i;
            for (i = 0; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0) {
                    break;
                }
            }
            if (ptr == i) {
                prime[ptr++] = n;
            }

        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

    }
}
