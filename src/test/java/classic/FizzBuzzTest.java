package classic;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 2. 27..
 */
public class FizzBuzzTest {
    @Test
    public void fizzBuzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> resultList = fizzBuzz.fizzBuzz(15);
        assertThat(resultList.size()).isEqualTo(15);
        assertThat(resultList.get(14)).isEqualTo("FizzBuzz");

    }

}