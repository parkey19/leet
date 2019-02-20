package classic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by parkey19 on 2019. 2. 20..
 */
public class RemoveArray {
    public static void main(String[] args) {
        RemoveArray removeArray = new RemoveArray();
        int[] arrn = {1,2,2};
        System.out.println(removeArray.removeDuplicates(arrn));

        System.out.println(arrn);
        for (int j = 0; j < arrn.length; j++) {
            System.out.println(arrn[j]);
        }
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}
