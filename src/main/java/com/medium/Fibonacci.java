package com.medium;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}).map(x->x[0]).limit(10).forEach(System.out::println);
    }
}
