package classic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by parkey19 on 2019. 3. 5..
 */
public class ReverseBitsTest {
    @Test
    public void reverseBits() throws Exception {
        ReverseBits reverseBits = new ReverseBits();
        assertThat(reverseBits.reverseBits(43261596)).isEqualTo(964176192);
    }




}