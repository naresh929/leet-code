package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Number "+romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character,Integer> mapping = new HashMap<>();
        int number = 0;
        mapping.put('I',1);
        mapping.put('V',5);
        mapping.put('X',10);
        mapping.put('L',50);
        mapping.put('C',100);
        mapping.put('D',500);
        mapping.put('M',1000);
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(i>0 && mapping.get(s.charAt(i-1))<mapping.get(c)){
                number = number - (2 * mapping.get(s.charAt(i-1)));
            }
            number = number + mapping.get(c);
        }
        return number;
    }
}
