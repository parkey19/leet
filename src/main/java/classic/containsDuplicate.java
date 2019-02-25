package classic;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by parkey19 on 2019. 2. 25..
 */
public class containsDuplicate {
    public static void main(String[] args) {
        containsDuplicate containsDuplicate = new containsDuplicate();
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i: nums) {
            set.add(i);
        }
        return nums.length != set.size();
    }
}
