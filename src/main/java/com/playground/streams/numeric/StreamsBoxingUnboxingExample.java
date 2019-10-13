package com.playground.streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsBoxingUnboxingExample {

  public static List<Integer> boxing() {
    return IntStream.rangeClosed(1, 10) // IntStream of 10 elements
        .boxed() // converts int to Integer
        .collect(Collectors.toList());
  }

  public static int unboxing(List<Integer> integerList) {
    // converts wrapper type to primitive
    return integerList.stream()
        // wrapper class types are provided to mapToInt one by one which will be converted to int
        // using intValue()
        .mapToInt(Integer::intValue)
        .sum();
  }

  public static void main(String[] args) {
    System.out.println("Boxing: " + boxing());
    System.out.println("Unboxing: " + unboxing(boxing()));
  }
}
