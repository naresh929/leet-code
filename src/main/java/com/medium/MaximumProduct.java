package com.medium;

import java.util.stream.IntStream;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 2, 7, 8};
        Integer maxProduct = IntStream.range(0, array.length)
                .mapToObj(i -> IntStream.range(i + 1, array.length)
                        .map(j -> array[j] * array[i])
                        .max()
                        .orElse(Integer.MIN_VALUE))
                .max(Integer::compare)
                .orElse(Integer.MIN_VALUE);
        System.out.println(maxProduct);
    }
}
