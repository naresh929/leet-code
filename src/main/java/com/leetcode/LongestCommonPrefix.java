package com.leetcode;

public class LongestCommonPrefix {
    //Write a function to find the longest common prefix string amongst an array of strings
    //If there is no common prefix, return an empty string "".
    //Example
    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String str = strs[0];
        for(int i=1;i< strs.length;i++){
            while(strs[i].indexOf(str)!=0){
                str = str.substring(0,str.length()-1);
                if(str.isEmpty())
                    break;
            }
        }
        System.out.println("SubString "+str);
    }
}
