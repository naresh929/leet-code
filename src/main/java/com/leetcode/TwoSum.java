package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println("indexes with sum equal to target"+twoSum(nums,target));
        Map<Integer,Integer> map = new HashMap<>();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                indexes[0] = i;
                indexes[1] = map.get(target-nums[i]).intValue();
                break;
            }
            map.put(nums[i],i);
        }
        return indexes;
    }
}
