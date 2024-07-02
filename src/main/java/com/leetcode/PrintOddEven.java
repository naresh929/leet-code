package com.leetcode;

import java.util.Map;

public class PrintOddEven {
    public static void main(String[] args) {
        int start = 0;
        int end = 20;
        Even even = new Even(start,end);
        Odd odd = new Odd(start,end);
        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);
        t1.start();
        t2.start();
    }
}
class Even implements Runnable {
    volatile int start;
    volatile int end;

    public Even(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        synchronized (this){
            while (start< end){
                while(start%2==0){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(start);
                start++;
                this.notify();
            }
        }
    }
}

class Odd implements Runnable {
    int start;
    int end;

    public Odd(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        synchronized (this){
            while (start< end){
                while(start%2!=0){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(start);
                start++;
                this.notifyAll();
            }
        }
    }
}