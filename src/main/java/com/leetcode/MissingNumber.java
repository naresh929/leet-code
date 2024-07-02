package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int n = nums.length;
        int sumSeries = n*(n+1)/2;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
        }
        System.out.println("Sum "+sum);
        System.out.println("missing number "+(sumSeries-sum));
    }
}
