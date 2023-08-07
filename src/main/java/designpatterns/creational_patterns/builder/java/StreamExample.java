package designpatterns.creational_patterns.builder.java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
        Stream<String> names = stringStreamBuilder.add("a").add("b").build();
//        Stream<String> names2 = Stream.builder().add("a").add("b").build();
        names.forEach(System.out::println);
    }
}
