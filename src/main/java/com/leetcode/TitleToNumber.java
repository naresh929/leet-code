package com.leetcode;

public class TitleToNumber {

    /*
    Excel Sheet Column Number
    Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
    For Example
    A -> 1
    AB -> 28
     */
    public static void main(String[] args) {
        String val = "A";
        int titleNumber = 0;
        for(int i=0;i<val.length();i++) {
            titleNumber= titleNumber*26 + Integer.valueOf(val.charAt(i) - 64);
        }
        System.out.println(titleNumber);
    }
}
