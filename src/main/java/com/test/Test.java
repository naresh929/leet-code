package com.test;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Person p = new Person("naresh",20);
        System.out.println(p.age());
        System.out.println(p.name());
        Person p1 = new Person("sachin");
        System.out.println(p1.name());
        System.out.println(p1.age());
    }
}

record Person(String name,int age){
    Person(String name){
        this(name,30);
    }
}