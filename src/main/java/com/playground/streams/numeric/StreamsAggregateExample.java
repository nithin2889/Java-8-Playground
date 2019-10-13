package com.playground.streams.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamsAggregateExample {
  public static void main(String[] args) {
    // Summation of all the values in the range
    int sum = IntStream.rangeClosed(1, 50).sum();
    System.out.println("Sum is: " + sum);

    // Max of all elements
    OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
    System.out.println(
        "Max value: " + (optionalInt.isPresent() ? optionalInt.getAsInt() : "not present"));

    // Min of all elements
    OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
    System.out.println(
        "Min value: " + (optionalLong.isPresent() ? optionalLong.getAsLong() : "not present"));

    // Average of all elements
    OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
    System.out.println(
        "Average value: "
            + (optionalDouble.isPresent() ? optionalDouble.getAsDouble() : "not present"));
  }
}
