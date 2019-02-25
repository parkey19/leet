package classic;

import java.util.Arrays;

/**
 * Created by parkey19 on 2019. 2. 25..
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        for (int j :
                nums) {
            System.out.println(j);
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]) return nums[i];
        }
        return 0;
    }
}
