package com.leetcode;


public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        int freq[] = new int[26];
        for (Character c : s.toCharArray()){
            freq[c-'a']++;
        }
        for (int indx = 0; indx < s.length(); indx++) {
            if (freq[s.charAt(indx) - 'a'] == 1) return indx;
        }
        return -1;
    }
}
