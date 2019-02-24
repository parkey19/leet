package classic;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 2. 24..
 */
public class RotateArrayTest {

    RotateArray rotateArray = new RotateArray();

    @Test
    public void rotate() throws Exception {
        int[] nums = {1,2,3,4,5,6,7};
        rotateArray.rotate(nums, 3);
        assertThat(nums[0]).isEqualTo(5);
        assertThat(nums[1]).isEqualTo(6);
        assertThat(nums[2]).isEqualTo(7);
    }

}