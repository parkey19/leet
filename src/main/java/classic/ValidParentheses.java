package classic;

import java.util.Stack;

/**
 * Created by parkey19 on 2019. 9. 29..
 */
public class ValidParentheses {
    public static boolean valid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if ('(' ==  c || '{' == c || '[' == c) {
                stack.push(c);
            } else if (c == ')') {
                if (stack.size() == 0 || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.size() == 0 || stack.pop() != '{') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.size() == 0 || stack.pop() != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        boolean valid = ValidParentheses.valid("(()");
        System.out.println(valid);

        boolean valid2 = ValidParentheses.valid("({})");
        System.out.println(valid2);

        boolean valid3 = ValidParentheses.valid("()");
        System.out.println(valid3);

        boolean valid4 = ValidParentheses.valid("(){}[]");
        System.out.println(valid4);
    }
}
