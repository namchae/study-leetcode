package me.wiz.leetcode.easy.week2;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        validParentheses.isValid("([{[]}])");
        validParentheses.isValidMore("([{[]}])");
    }

    public boolean isValid(String s) {
        int length;
        final String EMPTY = "";
        do {
            length = s.length();
            s = s.replace("()", EMPTY).replace("{}", EMPTY).replace("[]", EMPTY);
        } while (length != s.length());
        return s.length() == 0;
    }


    public boolean isValidMore(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
