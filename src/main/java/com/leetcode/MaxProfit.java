package com.leetcode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class MaxProfit {
    public static void main(String[] args) {
        int[] nums = {7,1,5,6,2};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            if(prices[i]-min>profit){
                profit = prices[i]-min;
            }
        }
        return profit;
    }
}
