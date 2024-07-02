package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,3,3};
        System.out.println(majorityElementByMap(nums));
        System.out.println(majorityElementBySorting(nums));
        System.out.println(majorityElementByMoore(nums));
    }
    public static int majorityElementByMap(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        return map.keySet().stream().filter(x->map.get(x)>nums.length/2).findFirst().get();
    }

    public static int majorityElementBySorting(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static int majorityElementByMoore(int[] nums) {
        int count=0;
        int candidate = 0;
        for(int num:nums){
            if(count==0){
                candidate = num;
            }
            if(candidate==num){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
