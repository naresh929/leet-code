package com.leetcode;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(3));
    }

    public static int fibonacciRecursive(int number){
        if(number == 1){
            return 0;
        }else if (number == 2){
            return 1;
        }else{
            return fibonacciRecursive(number-2)+fibonacciRecursive(number-1);
        }
    }

    public static void fibonacciIterative(int number){
        int first = 0;
        int second = 1;
        System.out.println();

    }
}
