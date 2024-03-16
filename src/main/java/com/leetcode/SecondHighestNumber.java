package com.leetcode;

public class SecondHighestNumber {

    //Find Second Highest number in an unsorted array
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 1, 9, 7};
        int maximum = Integer.MIN_VALUE;
        int seconMaximum = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>maximum){
                maximum = array[i];
            } else if (seconMaximum<maximum && array[i]>seconMaximum) {
                seconMaximum = array[i];
            }
        }
        System.out.println("Second Maximum value "+seconMaximum);
    }
}
