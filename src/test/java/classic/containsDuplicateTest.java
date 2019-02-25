package classic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by parkey19 on 2019. 2. 25..
 */
public class containsDuplicateTest {
    @Test
    public void containsDuplicate() throws Exception {
        containsDuplicate containsDuplicate = new containsDuplicate();
        int[] numsTrue1 = {1,2,3,1};
        int[] numsFalse1 = {1,2,3,4};
        int[] numsTrue2= {1,1,1,3,3,4,3,2,4,2};
        assertThat(containsDuplicate.containsDuplicate(numsTrue1)).isTrue();
        assertThat(containsDuplicate.containsDuplicate(numsFalse1)).isFalse();
        assertThat(containsDuplicate.containsDuplicate(numsTrue2)).isTrue();

    }

}