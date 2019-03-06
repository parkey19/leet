package classic;

import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 3. 6..
 */
public class ReverseIntegerTest {
    @Test
    public void reverse() throws Exception {
        ReverseInteger reverseInteger = new ReverseInteger();
//        assertThat(reverseInteger.reverse(-123)).isEqualTo(-321);
//        assertThat(reverseInteger.reverse(120)).isEqualTo(21);
//        assertThat(reverseInteger.reverse(123)).isEqualTo(321);
        assertThat(reverseInteger.reverse(1534236469)).isEqualTo(0);
    }

    @Test
    public void test() {
//        System.out.println(BigInteger.valueOf() "9646324351"));
    }

}