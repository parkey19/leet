package classic;

import java.util.Arrays;

/**
 * Created by parkey19 on 2019. 2. 25..
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        for (int k:nums
             ) {
            System.out.print(k+ " ");
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[nums.length-2] != nums[nums.length-1]){
            return nums[nums.length-1];
        } else {
            for (int i = 2; i < nums.length-1; i+=2) {
                if (nums[i] != nums[i+1]) return nums[i];
            }
        }
        return 0;
    }
}
