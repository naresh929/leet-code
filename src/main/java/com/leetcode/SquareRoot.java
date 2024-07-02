package com.leetcode;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Square root of "+ squareRoot(8));
    }

    public static int squareRoot(int num){
        if(num==0 || num==1){
            return num;
        }
        int temp;
        int sqrt = num/2;
        do{
            temp = sqrt;
            sqrt = (temp+num/temp)/2;
        }while((temp-sqrt)>0);
        return temp;
    }
}