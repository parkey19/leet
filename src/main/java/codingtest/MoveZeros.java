package codingtest;

public class MoveZeros {
    public static void main(String[] args) {
        int[] input = {0,3,2,0,8,5};
        int[] result = solve(input);
        for (int i: result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solve(int[] ints) {
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                ints[index] = ints[i];
                index++;
                System.out.println("index :" + index);
            }
        }

        while (index<ints.length) {
            ints[index]=0;
            index++;
        }

        return ints;
    }
}
