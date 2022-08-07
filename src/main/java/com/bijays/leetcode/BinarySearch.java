package com.bijays.leetcode;

public class BinarySearch {

    /**
     * Success
     * Details
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
     * Memory Usage: 43.4 MB, less than 85.22% of Java online submissions for Binary Search.
     */
    public static int search(int[] nums, int target) {
        if(nums.length ==0) return -1;
        int left = 0;
        int right = nums.length-1;

        while(left <=right){
            int midpoint = left + (right-left)/2;
            if(nums[midpoint] == target) return midpoint;
            if(nums[midpoint] < target){
                left=midpoint+1;
            }else if(nums[midpoint] > target){
                right= midpoint-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
