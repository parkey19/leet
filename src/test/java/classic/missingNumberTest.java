package classic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by parkey19 on 2019. 3. 3..
 */
public class missingNumberTest {
    //{3,0,1} 2
    //{2} 3
    //{0} 1
    //{1} 0
    //{2,3,5} 4
    @Test
    public void testMissingNumber() {
        missingNumber missingNumber = new missingNumber();
        int[] nums = {3,0,1};
        int[] nums1 = {9,6,4,2,3,5,7,0,1};
        int[] nums2 = {1};
        int[] nums3 = {0};
        int[] nums4 = {2,3,5};
        int[] nums5 = {2};
        int[] nums6 = {1,2};


        assertThat(missingNumber.missingNumber(nums)).isEqualTo(2);
        assertThat(missingNumber.missingNumber(nums1)).isEqualTo(8);
        assertThat(missingNumber.missingNumber(nums2)).isEqualTo(0);
        assertThat(missingNumber.missingNumber(nums3)).isEqualTo(1);
        assertThat(missingNumber.missingNumber(nums4)).isEqualTo(4);
        assertThat(missingNumber.missingNumber(nums5)).isEqualTo(3);
        assertThat(missingNumber.missingNumber(nums6)).isEqualTo(0);



    }

    @Test
    public void xorTest() {
        int i = 0^3;
        int i2 = i^3;
        System.out.println(i);
        System.out.println(i2);

        int i3 = 1^0;
        int i4 = i2^i3;
        System.out.println(i3);
        System.out.println(i4);

        int i5 = 2^1;
        int i6 = i5^i4;
        System.out.println(i5);
        System.out.println(i6);
    }
}