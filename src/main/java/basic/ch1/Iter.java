package basic.ch1;

/**
 * Created by parkey19 on 2019. 5. 26..
 */
public class Iter {

    public static int sumof(int a, int b) {
        int first = 0;
        int last = 0;
        if (a>=b) {
            first = b;
            last = a;
        } else {
            first = a;
            last = b;
        }
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        return sum;
    }

    static int sum(int n){
        if(n % 2 == 0){
            return (n + 1) * (n / 2);
        }else{
            return n * ((n - 1) / 2) + n;
        }
    }

    public static void main(String[] args) {
        int sum = sum(10);
        int sum2 = sum(9);
        int sum3 = sum(1);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println(sumof(5,3));
    }
}
