package programers;

import java.util.*;

/**
 * Created by parkey19 on 2019. 3. 9..
 */
public class IntDupCheck {
    public int[] solution(int []arr) {
        if (arr.length == 1) return arr;

        ArrayList<Integer> list = new ArrayList<>();
        int temp = 10;

        for (int i = 0; i < arr.length; i++) {
            if (temp != arr[i]) {
                temp = arr[i];
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}
