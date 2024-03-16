package com.leetcode;

public class Fibonacci {
    public static void main(String[] args) {
        int number = 7;
//        for(int i = 1;i<=number;i++){
//            System.out.print(fibonacciRecursive(i)+" ");
//        }
        fibonacciIterative(7);
    }

    public static int fibonacciRecursive(int number){
        if(number == 1){
            return 0;
        }else if (number ==2){
            return 1;
        }else{
            return fibonacciRecursive(number-2)+fibonacciRecursive(number-1);
        }
    }

    public static void fibonacciIterative(int number){
        int n1;
        int n2 = 0;
        int n3 = 1;
        for(int i=1;i<=number;i++){
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.print(n1 + " ");
        }
    }
}
