package programers;


import com.sun.tools.javac.util.ArrayUtils;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 3. 9..
 */
public class IntDupCheckTest {
    @Test
    public void solution() throws Exception {
        IntDupCheck intDupCheck = new IntDupCheck();
        int[] arr = {4,4,1,1};
        int[] arr2 = {1, 1, 3, 3, 0, 1, 1};
        int[] resultArr = intDupCheck.solution(arr);
        int[] resultArr2 = intDupCheck.solution(arr2);
        assertThat(resultArr).containsExactly(4,1);
        assertThat(resultArr2).containsExactly(1,3,0,1);
    }

    @Test
    public void test() {
        int[] answer = {};

        answer[0] = 1;
        for (int i: answer) {
            System.out.println(i);
        }
    }

}