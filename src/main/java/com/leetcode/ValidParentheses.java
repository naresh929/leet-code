package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(])";
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else {
                if(stack.size()==0){
                    break;
                }
                Character item = stack.peek();
                if(s.charAt(i)==map.get(item)){
                    stack.pop();
                }
            }
        }
        if(stack.size()==0){
            System.out.println("Match");
        }else{
            System.out.println("Not Match");
        }
    }
}
