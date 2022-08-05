package com.bijays.leetcode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] twoSumIndex = new int[2];
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    twoSumIndex[0]=i;
                    twoSumIndex[1]=j;
                }
            }
        }
        return twoSumIndex;
    }

    //
    public static int[] twoSum1(int[] nums, int target) {
        int[] newArray = new int[2];
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++){
            if(!numsMap.containsKey(target-nums[i])){
                numsMap.put(nums[i], i);
            }else{
                newArray[0]=numsMap.get(target-nums[i]);
                newArray[1] = i;
            }
        }
        return newArray;
    }

    /*
    *
    * Success
      Details
      Runtime: 7 ms, faster than 54.42% of Java online submissions for Two Sum.
      Memory Usage: 47.3 MB, less than 6.29% of Java online submissions for Two Sum.
     */
    public static void main(String[] args) {
        int[] sampleArr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum1(sampleArr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
