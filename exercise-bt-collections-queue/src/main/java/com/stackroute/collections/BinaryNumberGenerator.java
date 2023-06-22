package com.stackroute.collections;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    public String findBinaryNumbersSequence(int N) {
        if (N <= 0) {
            return "Give proper input not zero or negative";
        } else if (N > 20) {
            return "Give proper input not greater than 20";
        }

        StringBuilder result = new StringBuilder();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < N; i++) {
            String current = queue.poll();
            result.append(current).append(" ");

            String next1 = current + "0";
            String next2 = current + "1";
            queue.offer(next1);
            queue.offer(next2);
        }

        return result.toString().trim();
    }
}
