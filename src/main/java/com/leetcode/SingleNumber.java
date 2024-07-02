package com.leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ints = singleNumber(nums);
        for (int n: ints){
            System.out.println(n);
        }
    }
    public static int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for (int num:nums){
            boolean add = set.add(num);
            if(add){
                set.add(num);
            }else{
                set.remove(num);
            }
        }
        int i = 0;
        for (Integer integer : set) {
            result[i] = integer;
            i++;
        }
        return result;
    }
}
