package com.bijays.leetcode;

public class BestTimeToBuyStock {

    public static int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 1, 2, 3, 4, 6, 5};
        System.out.println(maxProfit(numbers));
    }
}
