package com.bijays.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicate {

    //this is the best solution 10ms
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> bowl = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(bowl.contains(nums[i])){
                return true;
            }else{
                bowl.add(nums[i]);
            }
        }

        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        if(count >=2){
            return true;
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> bowl = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            bowl.add(nums[i]);
        }

        return bowl.size() != nums.length;
    }
}
