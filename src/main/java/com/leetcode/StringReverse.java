package com.leetcode;

public class StringReverse {
    //Reverse a string ( word or a sentence) iterative/recursive way.
    public static void main(String[] args) {
        System.out.println(reverseIterative("abc"));
        reverseRecursive("abc");
    }

    public static void reverseRecursive(String str){
        if(str.length()<=1)
            System.out.println(str);
        else{
            System.out.print(str.charAt(str.length()-1));
            reverseRecursive(str.substring(0,str.length()-1));
        }
    }

    public static String reverseIterative(String str){
        String reverseString = "";
        for (int i = str.length()-1;i>=0;i--)
            reverseString = reverseString.concat(str.charAt(i)+"");
        return reverseString;
    }
}
