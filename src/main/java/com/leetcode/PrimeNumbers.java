package com.leetcode;

public class PrimeNumbers {
    //Prime no generation between 2 numbers
    public static void main(String[] args) {
        for(int i=5;i<=13;i++){
            if(isPrime(i)){
                System.out.println("Prime Number "+i);
            }
        }
    }
    public static boolean isPrime(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
