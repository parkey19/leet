package classic;

/**
 * Created by parkey19 on 2019. 3. 7..
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int lastIndex = s.length-1;
        int loopCount = s.length / 2;
        char c;
        for (int i = 0; i < loopCount; i++) {
            c = s[i];
            s[i] = s[lastIndex];
            s[lastIndex] = c;
            lastIndex--;
        }
        for (char cc: s
             ) {
            System.out.println(cc);
        }
    }
}
