package com.designpattern;

public class SingletonPattern {
    //creational design pattern
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}

class Singleton{
    private static Singleton instance = null;
    // Private constructor to prevent instantiation
    private Singleton(){
    }
    // Public static method to get the instance
    public static Singleton getInstance(){
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton.class){
            if (instance == null){
                instance = new Singleton();// Lazy initialization
            }
        }
        return instance;
    }
}