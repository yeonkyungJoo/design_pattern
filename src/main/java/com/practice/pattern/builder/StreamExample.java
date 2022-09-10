package com.practice.pattern.builder;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        // Stream<String> names = Stream.builder().build();
        Stream<String> names = Stream.<String>builder().build();
    }
}
