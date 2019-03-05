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
        List<Integer> row = new ArrayList<>();
        row.add(1);
        lists.add(row);
        for (int j = 1; j < numRows; j++) {
            List<Integer> oldList = lists.get(j-1);
            row = new ArrayList<>();
            row.add(1);
            for (int k = 1; k < j; k++) {
                row.add(oldList.get(k-1) + oldList.get(k));
            }
            row.add(1);
            lists.add(row);
        }
        return lists;
    }
}
