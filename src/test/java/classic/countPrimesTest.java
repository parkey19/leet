package classic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by parkey19 on 2019. 3. 2..
 */
public class countPrimesTest {
    @Test
    public void countPrimes() throws Exception {
        countPrimes countPrimes = new countPrimes();
//        assertThat(countPrimes.countPrimes(10)).isEqualTo(4);
//
//        assertThat(countPrimes.countPrimes(97)).isEqualTo(24);
//
//        assertThat(countPrimes.countPrimes(1)).isEqualTo(0);
//
//        assertThat(countPrimes.countPrimes(2)).isEqualTo(0);

        assertThat(countPrimes.countPrimes(499979)).isEqualTo(41537);


    }

    @Test
    public void test(){
        countPrimes countPrimes = new countPrimes();
        int[] filter = countPrimes.isFilter(499979);
        System.out.println(filter.length);
    }



}