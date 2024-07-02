package com.leetcode;

public class IndexOfFirstOccurence {

    //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    //
    //
    //
    //Example 1:
    //
    //Input: haystack = "sadbutsad", needle = "sad"
    //Output: 0
    //Explanation: "sad" occurs at index 0 and 6.
    //The first occurrence is at index 0, so we return 0.
    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())
            return -1;
        int j=0;
        for(int i = 0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j) && haystack.substring(i,(needle.length()+i)>haystack.length()?i:needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issipi";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }


}
