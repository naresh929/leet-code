package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairsOfGivenSum {
    // Find all pairs equal to a given sum
    public static void main(String[] args) {
        int[] nums = new int[]{15, 12, 4, 16, 9, 8, 24, 0};
        int sum = 24;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(sum-nums[i])){
                System.out.println("Sum pair "+nums[i]+" "+map.get(sum-nums[i]));
            }
            map.put(nums[i],nums[i]);
        }
    }
}
