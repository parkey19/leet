package basic.ch2;

public class PrimeNumber {

    public static void main(String[] args) {
        brutePrime();
        System.out.println("---");
        upgradePrime();
        System.out.println("---");
        upgrade2Prime();
    }

    static void brutePrime() {
        long s = System.nanoTime();
        int counter = 0;

        for (int n = 2; n < 1000; n++) {
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
        long e = System.nanoTime();
        System.out.println(e-s);
    }

    static void upgradePrime(){
        long s = System.nanoTime();
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 3; n <= 1000; n+=2) {
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

        long e = System.nanoTime();
        System.out.println(e-s);
    }

    static void upgrade2Prime(){
        long s = System.nanoTime();
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int n = 5; n <= 1000; n+=2) {
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter+=2;
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }

        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        long e = System.nanoTime();
        System.out.println(e-s);
    }
    //7325323
    //5086222
    //2836611
}
