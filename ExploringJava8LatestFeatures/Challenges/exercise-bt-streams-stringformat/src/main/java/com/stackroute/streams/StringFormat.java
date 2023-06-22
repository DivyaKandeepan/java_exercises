package com.stackroute.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringFormat {
    public String findStringFormat(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return "Give proper input not empty list";
        }

        if (numbers.stream().anyMatch(n -> n < 0)) {
            return "Give proper input not negative values";
        }

        return numbers.stream()
                .map(n -> (n % 2 == 0) ? "even" + n : "odd" + n)
                .collect(Collectors.joining(","));
    }
}
