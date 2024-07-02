package com.medium;

import java.util.Arrays;
import java.util.List;

public class CharacterOccurrence {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "melon");
        char target = 'a';
        long count = strings.stream().flatMapToInt(CharSequence::chars).filter(c -> c == target).count();
        System.out.println(count);
    }
}
