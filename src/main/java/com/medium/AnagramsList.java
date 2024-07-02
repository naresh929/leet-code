package com.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramsList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("listen", "silent", "hello", "world", "night", "thing");
        List<String> list = words.stream().collect(Collectors.groupingBy(str -> {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        })).entrySet().stream().filter(x -> x.getValue().size() == 1).flatMap(x->x.getValue().stream()).toList();
        System.out.println(list);
    }
}
