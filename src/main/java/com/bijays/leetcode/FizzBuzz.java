package com.bijays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 413
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> numbers = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                numbers.add("FizzBuzz");
            }else if( i%3 ==0){
                numbers.add("Fizz");
            }else if(i%5 ==0){
                numbers.add("Buzz");
            }else{
                numbers.add(i+"");
            }
        }
        return numbers;
    }

    public List<String> fizzBuzz1(int n) {
        ArrayList<String> result = new ArrayList<>();
        HashMap<Integer, String> fizzBuzzMapper = new HashMap<>(){
            {
                put(3, "Fizz");
                put(5, "Buzz");
            }
        };
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 5));
        for(int i=1; i<=n; i++){
            StringBuilder sb = new StringBuilder();
            for(Integer num: nums){
                if(i%num == 0){
                    sb.append(fizzBuzzMapper.get(num));
                }
            }
            if(sb.isEmpty()){
                sb.append(i);
            }
            result.add(sb.toString());
        }
        return result;

    }
}
