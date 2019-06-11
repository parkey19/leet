package basic.ch2;


import java.util.Scanner;

public class DayOfYear {
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31}, //평
            {31,28,31,30,31,30,31,31,30,31,30,31}  //윤
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1:0;
    }

    static int dayOfYear(int y, int m, int d) {
//        int days = d;
//
//        for(int i =1; i<m; i++) {
//            days+=mdays[isLeap(y)][i];
//        }
//        return days;
        m=m-2;
        while (m>=0) {
            d += mdays[isLeap(y)][m];
            m--;
        }
        return d;


    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int retry;

        System.out.println("경과 일수 구하기");

        do {
            System.out.print("년:"); int year = stdIn.nextInt();
            System.out.print("월:"); int month = stdIn.nextInt();
            System.out.print("일:"); int day = stdIn.nextInt();
            System.out.println("d :" + dayOfYear(year,month,day));
            System.out.println("retry? (1.yes,0:no)");
            retry = stdIn.nextInt();
        } while (retry==1);
    }
}
