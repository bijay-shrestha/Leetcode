package com.bijays.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> bowl = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            bowl.add(nums[i]);
        }

        return bowl.size() != nums.length;
    }

    public boolean containsDuplicate1(int[] nums) {
        HashMap<Integer, Integer> duplicateMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++){
            if(!duplicateMap.containsKey(nums[i])){
                duplicateMap.put(nums[i], 1);
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(numbers));
    }
}
