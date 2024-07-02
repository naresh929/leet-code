package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class ProducerConsumer {
    public static void main(String[] args) {
        System.out.println("How to use wait and notify method in Java");
        System.out.println("Solving Producer Consumper Problem");
        Stack<Integer> stack = new Stack<>();
        int maxSize = 10;
        Runnable producer = new Producer(stack, maxSize);
        Runnable consumer = new Consumer(stack);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
class Producer implements Runnable{
    private final Stack<Integer> stack;
    private final int maxSize;
    public Producer(Stack<Integer> stack, int maxSize){
        this.stack = stack;
        this.maxSize = maxSize;
    }

    @Override
    public void run(){
        while (true){
            synchronized (stack){
                if (stack.size()== maxSize){
                    try{
                        System.out .println("Queue is full, "
                                + "Producer thread waiting for "
                                + "consumer to take something from queue");
                        stack.wait();
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                System.out.println("Producing Value "+i);
                stack.push(i);
                stack.notifyAll();
            }
        }
    }
}

class Consumer implements Runnable{
    private final Stack<Integer> stack;

    public Consumer(Stack<Integer> stack){
        this.stack = stack;
    }

    @Override
    public void run(){
        while (true){
            synchronized (stack){
                if (stack.size()==0){
                    System.out.println("Queue is empty,"
                            + "Consumer thread is waiting"
                            + " for producer thread to put something in queue");
                    try{
                        stack.wait();
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
                System.out.println("Consuming value :"+ stack.pop());
                stack.notifyAll();
            }
        }
    }
}