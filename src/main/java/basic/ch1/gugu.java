package basic.ch1;

/**
 * Created by parkey19 on 2019. 5. 29..
 */
public class gugu {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if(i==1) System.out.print("  |");
            System.out.printf("%3d", i);
        }
        System.out.println("");
        System.out.println("-------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i*j);
            }
            System.out.println(" ");
        }

        square(5);
    }

    static void square(int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
