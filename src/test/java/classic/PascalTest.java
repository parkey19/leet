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

        List<List<Integer>> generate = pascal.generate(5);
        assertThat(generate.get(1)).contains(1,1);

        assertThat(generate.get(2)).contains(1,2,1);

        assertThat(generate.get(3)).contains(1,3,3,1);

        assertThat(generate.get(4)).contains(1,4,6,4,1);
    }

}