package com.leetcode;

public class ValidPalindrome {
    //A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    //Given a string s, return true if it is a palindrome, or false otherwise.
//    Example 1:
//
//    Input: s = "A man, a plan, a canal: Panama"
//    Output: true
//    Explanation: "amanaplanacanalpanama" is a palindrome.
    public static void main(String[] args) {
        String s = "0P";
        String string = s.toLowerCase().replaceAll("[^a-z]", "");
        boolean flag = false;
        for(int i=0,j=string.length()-1;i<string.length()/2 && string.length()>1;i++,j--){
            if(string.charAt(i)==string.charAt(j)){
                flag = true;
                continue;
            }else{
                flag = false;
                break;
            }
        }
        System.out.println("String is Valid Palindrome "+(string.length()<2?true:flag));
    }
}
