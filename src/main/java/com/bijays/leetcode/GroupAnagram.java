package com.bijays.leetcode;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> groupMap = new HashMap<String, List<String>>();

        if(strs.length ==1){
            result.add(Arrays.asList(strs));
            return result;
        }

        for(int i=0; i<strs.length; i++){
            String originalValue = strs[i];
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            if(!groupMap.containsKey(key)){
                groupMap.put(key, new ArrayList<String>());
                groupMap.get(key).add(strs[i]);
            }else{
                groupMap.get(key).add(strs[i]);
            }
        }

        for(Map.Entry<String, List<String>> resultMap: groupMap.entrySet()){
            result.add(resultMap.getValue());
        }

        return result;

    }

    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
    }
}
