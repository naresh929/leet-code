package com.leetcode;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial Recursive::"+factorialRecursive(5));
        System.out.println("Factorial Iterative::"+factorialIterative(5));
    }
    public static int factorialRecursive(int number){
        if(number == 1)
            return number;
        else
            return number * factorialRecursive(number-1);
    }

    public static int factorialIterative(int number){
        int factorial = 1;
        while (number>0){
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }
}
