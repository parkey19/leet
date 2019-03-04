package classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by parkey19 on 2019. 3. 4..
 */
public class Pascal {
    public List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> lists = new ArrayList<>(numRows);
        if (numRows == 0) return lists;
        List<Integer> first = Arrays.asList(1);
        lists.add(first);
        if (numRows == 1) {
            return lists;
        }
        List<Integer> seconds = Arrays.asList(1, 1);
        lists.add(seconds);
        if (numRows == 2) {
            return lists;
        }

        for (int j = 2; j < numRows; j++) {
            List<Integer> oldList = lists.get(j-1);
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for (int k = 1; k < j; k++) {
                int sum = oldList.get(k-1) + oldList.get(k);
                newList.add(sum);
            }
            newList.add(1);
            lists.add(newList);
        }
        return lists;
    }
}
