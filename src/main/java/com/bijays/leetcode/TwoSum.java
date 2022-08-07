package com.bijays.leetcode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] twoSumIndex = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    twoSumIndex[0] = i;
                    twoSumIndex[1] = j;
                }
            }
        }
        return twoSumIndex;

    }
    /**
    * Success
      Details
      Runtime: 7 ms, faster than 54.42% of Java online submissions for Two Sum.
      Memory Usage: 47.3 MB, less than 6.29% of Java online submissions for Two Sum.
     **/
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


    /**
     *
     * Success
     * Details
     * Runtime: 1 ms, faster than 99.70% of Java online submissions for Two Sum.
     * Memory Usage: 42.6 MB, less than 88.57% of Java online submissions for Two Sum.
     *
     * */
    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(numMap.containsKey(target-nums[i])){
                result[0] = numMap.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            numMap.put(nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
        int[] sampleArr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum1(sampleArr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
