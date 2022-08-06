package com.bijays.leetcode;

import java.util.HashSet;
import java.util.Stack;

public class ValidParenthesis {
    /**
     * Success
     * Details
     * Runtime: 16 ms, faster than 5.21% of Java online submissions for Valid Parentheses.
     * Memory Usage: 43.9 MB, less than 6.37% of Java online submissions for Valid Parentheses.
     */
    public static boolean isValid(String s) {

        HashSet<String> set = new HashSet<>();
        set.add("()");
        set.add("{}");
        set.add("[]");

        Stack<Character> sStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (sStack.size() > 0) {
                String concatString = "" + sStack.peek() + s.charAt(i);
                if (!set.contains(concatString)) {
                    sStack.push(s.charAt(i));
                } else {
                    sStack.pop();
                }
            } else {
                sStack.push(s.charAt(i));
            }
        }

        if (sStack.size() == 0) return true;

        return false;
    }

    public static void main(String[] args) {
//        String parenthesis = "[{()}]";
        String parenthesis = "{}()[]";
        System.out.println(isValid(parenthesis));
    }
}
