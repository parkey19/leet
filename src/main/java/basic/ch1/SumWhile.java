package basic.ch1;

import java.util.Scanner;

/**
 * Created by parkey19 on 2019. 5. 26..
 */
public class SumWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.println("sum : " + sum);

    }
}
