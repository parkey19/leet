package classic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 3. 8..
 */
public class GetSumTest {
    @Test
    public void getSum() throws Exception {
        GetSum getSum = new GetSum();
        assertThat(getSum.getSum(-2,3)).isEqualTo(1); //1
        assertThat(getSum.getSum(1,2)).isEqualTo(3); //1
        assertThat(getSum.getSum(1,1)).isEqualTo(2); //1
        assertThat(getSum.getSum(-1,-1)).isEqualTo(-2); //1
        assertThat(getSum.getSum(3,-2)).isEqualTo(1); //1
    }

}