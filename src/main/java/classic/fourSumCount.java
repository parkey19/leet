package classic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by parkey19 on 2019. 3. 8..
 */
public class fourSumCount {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<C.length; i++) {
            for(int j=0; j<D.length; j++) {
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int res=0;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B.length; j++) {
                res += map.getOrDefault(-1 * (A[i]+B[j]), 0);
            }
        }

        return res;
    }

//    public int fourSumCount(int[] A, int[] B, int[] C, int[] D){
//        int size = A.length;
//        int sum = 0;
//        int count = 0;
//        int temp = 0;
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                for (int k = 0; k < size; k++) {
//                    for (int l = 0; l < size; l++) {
//                        sum = A[i] + B[j] + C[k] + D[l];
//                        if (sum == 0) count++;
//                    }
//                }
//            }
//
//        }
//        return count;
//    }

    public void tuple(int[] A, int[] B, int[] C, int[] D) {
        int size = A.length;
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                for (int k = 0; k < size; k++) {
//                    for (int l = 0; l < size; l++) {
//                        System.out.println(i+","+j+","+k+","+l);
//                    }
//                }
//            }
//
//        }



    }
}
