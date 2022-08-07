package com.bijays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> sums = new ArrayList<>();
        ArrayList<Integer> subSums = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i< nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int target = 0 - nums[i];
            int left = i+1;
            int right = nums.length -1;
            while(right > left){
                int sum = nums[left] + nums[right];
                if(sum > target){
                    right = right-1;
                }else if(sum < target){
                    left = left+1;
                }else{
                    subSums.add(nums[i]);
                    subSums.add(nums[left]);
                    subSums.add(nums[right]);
                    sums.add(subSums);
                    while(nums[left] == nums[left+1]){
                        left  = left + 1;
                    }
                    while(nums[right] == nums[right-1]){
                        right = right -1;
                    }
                    left++;
                    right--;
                }
            }

        }
        return sums;

    }

    public static void main(String[] args) {
        int[] arr = {0, -1, -4, 3, 1, 2, 3};
        threeSum(arr);
    }
}
