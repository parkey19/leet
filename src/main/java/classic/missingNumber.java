package classic;

import java.util.Arrays;

/**
 * Created by parkey19 on 2019. 3. 3..
 */
public class missingNumber {
    //{3,0,1} 2
    //{2} 3
    //{0} 1
    //{1} 0
    //{2,3,5} 4
    //{1,2} 3
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
