package com.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        String string = strings.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(string);
    }
}
