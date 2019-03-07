package classic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 3. 7..
 */
public class ReverseStringTest {
    @Test
    public void reverseString() throws Exception {
        ReverseString reverseString = new ReverseString();
        char[] s = {'a', 'b', 'c', 'd', 'e', 'f'};
        reverseString.reverseString(s);
        assertThat(s).containsExactly('f', 'e', 'd', 'c', 'b', 'a');
    }

}