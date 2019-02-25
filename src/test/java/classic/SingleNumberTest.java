package classic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 2. 25..
 */
public class SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        SingleNumber singleNumber = new SingleNumber();
        int[] num = {1};
        assertThat(singleNumber.singleNumber(num)).isEqualTo(1);
        int[] nums = {2,2,1};
        assertThat(singleNumber.singleNumber(nums)).isEqualTo(1);

        int[] nums2 = {4,1,2,1,2};
        assertThat(singleNumber.singleNumber(nums2)).isEqualTo(4);
    }

}