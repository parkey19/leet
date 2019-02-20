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
    }

    public int removeDuplicates(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed()
                .distinct()
                .collect(Collectors.toList());
        nums = list.stream().mapToInt(i->i).toArray();
        System.out.println(nums[0] + " " + nums[1]);
        return nums.length;
    }
}
