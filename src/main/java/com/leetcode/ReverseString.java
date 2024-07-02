package com.leetcode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String reverse = "hello";
        char[] charArray = reverse.toCharArray();
        int right = charArray.length-1;
        for(int i=0;i<right-1;i++){
            char temp = charArray[i];
            charArray[i] = charArray[right];
            charArray[right] = temp;
            right--;
        }
        String string = new String(charArray);
        System.out.println(string);
    }
}
