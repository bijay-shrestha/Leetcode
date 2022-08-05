package com.bijays.leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        String newS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int startIdx = 0;
        int endIdx = newS.length()-1;

        while(startIdx < endIdx){
            Character sC = newS.charAt(startIdx);
            Character tC = newS.charAt(endIdx);
            if (!sC.equals(tC)){
                return false;
            }
            startIdx++;
            endIdx--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
