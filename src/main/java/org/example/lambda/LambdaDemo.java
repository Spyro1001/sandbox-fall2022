package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaDemo {

    public static void main(String[] args) {

        // x -> x * 2
        // anonymous function

        // Predicate - take 1 value returns a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - take 1 value and return a value
        Function<Integer, Integer> function = x -> x * 2;

        // Supplier - take nothing and return a value
        Supplier<String> supplier = () -> "Hello World!";

        // Consumer - takes 1 value returns nothing
        Consumer<String> consumer = x -> System.out.println(x);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
              .sorted()
              .filter(x -> x.startsWith("c"))
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }


}
