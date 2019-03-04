package classic;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 3. 4..
 */
public class PascalTest {
    @Test
    public void generate() throws Exception {
        Pascal pascal = new Pascal();

        List<List<Integer>> generate3 = pascal.generate(3);
        assertThat(generate3.get(2)).contains(1,2,1);

        List<List<Integer>> generate4 = pascal.generate(4);
        assertThat(generate4.get(3)).contains(1,3,3,1);

        List<List<Integer>> generate5 = pascal.generate(5);
        assertThat(generate5.get(4)).contains(1,4,6,4,1);
    }

}