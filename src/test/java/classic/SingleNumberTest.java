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
        int[] nums3 = {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
        assertThat(singleNumber.singleNumber(nums3)).isEqualTo(16);
    }

    @Test
    public void singleNumber2() {
        SingleNumber singleNumber = new SingleNumber();
        int[] num = {1,1,2};
        assertThat(singleNumber.singleNumber2(num)).isEqualTo(2);
    }

    @Test
    public void test() {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));
    }

}