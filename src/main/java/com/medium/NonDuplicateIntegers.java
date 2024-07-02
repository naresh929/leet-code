package com.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonDuplicateIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 9);
        List<Integer> list = numbers.stream()
                .collect(Collectors.groupingBy(x -> x))
                .entrySet().stream().filter(r -> r.getValue().size()==1).map(y->y.getKey()).toList();
        System.out.println(list);
    }
}
