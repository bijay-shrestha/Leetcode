package com.bijays.leetcode;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMapper = new HashMap<>();
        romanMapper.put('M', 1000);
        romanMapper.put('D', 500);
        romanMapper.put('C', 100);
        romanMapper.put('L', 50);
        romanMapper.put('X', 10);
        romanMapper.put('V', 5);
        romanMapper.put('I', 1);

        Integer total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && romanMapper.get(s.charAt(i)) > romanMapper.get(s.charAt(i - 1))) {
                total += romanMapper.get(s.charAt(i));
                total -= 2 * romanMapper.get(s.charAt(i - 1));
                continue;
            }
            total += romanMapper.get(s.charAt(i));
        }
        return total;
    }

    public static void main(String[] args) {
        String romanNumber = "IV";
        System.out.println(romanToInt(romanNumber));
    }
}
