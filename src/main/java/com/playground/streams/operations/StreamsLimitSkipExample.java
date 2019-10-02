package com.playground.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

  // 1. perform summation of part of the stream from the list
  public static Optional<Integer> limit(List<Integer> integers) {
    return integers.stream()
        // only the first 2 elements will be passed to the reduce function
        .limit(3)
        .reduce((x, y) -> x + y);
  }

  // 1. perform summation of part of the stream from the list
  public static Optional<Integer> skip(List<Integer> integers) {
    return integers.stream()
        // skips the first 3 elements and the rest will be passed to the reduce function
        .skip(3)
        .reduce((x, y) -> x + y);
  }

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

    Optional<Integer> limitResult = limit(integerList);
    if (limitResult.isPresent()) {
      System.out.println("Limit result: " + limitResult.get());
    } else {
      System.out.println("No input passed");
    }

    Optional<Integer> skipResult = skip(integerList);
    if (skipResult.isPresent()) {
      System.out.println("Skip result: " + skipResult.get());
    } else {
      System.out.println("No input passed");
    }
  }
}
