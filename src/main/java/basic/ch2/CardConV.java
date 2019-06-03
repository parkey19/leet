package basic.ch2;

import java.util.Scanner;

/**
 * Created by parkey19 on 2019. 6. 3..
 */
public class CardConV {
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x%r);
            x /= r;

        } while (x!=0);
            return digits;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진 기수 변환");

        do {
            do {
                System.out.println("음이아닌 정수");
                no = stdIn.nextInt();
            } while (no <0);

            do {
                System.out.println("(2~36) 진수");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd >36);

            dno = cardConvR(no, cd, cno);

            System.out.println(cd + "진수로는 ");

            for (int i = dno -1; i >=0; i--) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.println("retry ? (1.yes, 2.no):");
            retry = stdIn.nextInt();

        } while (retry == 1);

    }

}
