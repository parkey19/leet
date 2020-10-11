package classic;

import java.util.HashMap;

/**
 * Created by parkey19 on 2019. 9. 29..
 */
public class TwoSum {
    public static int[] sumTarget(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            if (map.containsKey(target-cur)) {
                int[] ints = new int[2];
                ints[0] = map.get(target-cur);
                ints[1] = i;
                return ints;
            } else {
                map.put(cur, i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a= new int[4];
        a[0] = 2;
        a[1] = 7;
        a[2] = 11;
        a[3] = 5;

        int[] ints = TwoSum.sumTarget(a, 9);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
