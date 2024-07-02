package com.leetcode;

import java.util.Arrays;

public class PlusOneSolution {

    //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    //
    //Increment the large integer by one and return the resulting array of digits.
    //Example 1:
    //
    //Input: digits = [1,2,3]
    //Output: [1,2,4]
    //Explanation: The array represents the integer 123.
    //Incrementing by one gives 123 + 1 = 124.
    //Thus, the result should be [1,2,4].
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] ints = plusOne(digits);
        Arrays.stream(ints).forEach(x->System.out.println(x));
    }

    public static int[] plusOne(int[] digits) {
        long sum = 0;
        for(int i = 0 ; i< digits.length;i++){
            sum = sum*10+digits[i];
        }
        sum++;
        int[] array = new int[(sum+"").length()];
        for(int i = array.length-1;i>=0;i--){
            array[i] = (int) (sum % 10);
            sum = sum/10;
        }
        return array;
    }
}
