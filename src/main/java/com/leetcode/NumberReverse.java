package com.leetcode;

public class NumberReverse {
    public static void main(String[] args) {
        int number = 12401;
        int reverseNumber = 0;
        while(number>0){
            reverseNumber = reverseNumber*10 + number%10;
            number = number/10;
        }
        System.out.println(reverseNumber);
    }
}
