package com.leetcode;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        boolean flag = true;
        for(int i = 0, j = str.length()-1;i <str.length();i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Palindrome");
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println("Palindrome");
        }
    }
}
