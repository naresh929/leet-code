package com.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = -12321;
        System.out.println("number "+number+ " is palindrome "+isPalindrome(number));
    }
    public static boolean isPalindrome(int x) {
        int reverseNumber = 0;
        int temp = x;
        while(x!=0){
            reverseNumber = reverseNumber*10 + x%10;
            x = x/10;
        }
        if(temp==reverseNumber && temp>0){
            return true;
        }else{
            return false;
        }
    }
}
