package classic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parkey19 on 2019. 9. 27..
 */
public class GenParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        process(n, 0,0,"",list);
        list.stream().forEach(System.out::println);
        return list;
    }

    private void process(int n, int numOpen, int numClosed, String s, List<String> ret) {

        if (numOpen == n && numClosed == n) {
            ret.add(s);
            return;
        }

        if (numOpen < n) {
            process(n, numOpen+1, numClosed, s+"(", ret);
        }

        if (numOpen > numClosed) {
            process(n, numOpen, numClosed+1, s+")", ret);
        }

    }

    public static void main(String[] args) {
        GenParentheses genParentheses = new GenParentheses();
        genParentheses.generateParenthesis(3);
    }

}
