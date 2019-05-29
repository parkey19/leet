package basic.ch1;

/**
 * Created by parkey19 on 2019. 5. 29..
 */
public class excercise {
    public static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void triangleRU(int n) {
        int k = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            k--;
            System.out.println("");
        }
    }

    public static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            int k = i-1;
            for (int j = 1; j <= n; j++) {
                if (j > k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void spira(int n) {
        int last = (n-1)*2+1;
        int k = n;
        for (int i = 1; i <= n; i++) {
            int rowCount = (i-1)*2+1;
            int drawCount = 0;
            for (int j = 1; j <= last; j++) {
                if(j >= k && drawCount < rowCount) {
                    System.out.print("*");
                    drawCount++;
                } else {
                    System.out.print(" ");
                }
            }
            k--;
            System.out.println("");
        }

        
    }

    public static void main(String[] args) {
//        triangleLU(4);
//        triangleRU(5);
//        triangleRB(5);
          spira(10);
    }
}
