package com.playground.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinByMaxByExample {

  // 1. Calculate the max element from the integer list
  public static int getMaxElement(List<Integer> integerList) {
    return integerList.stream()
        // avoid assigning a default when performing min and max value from a stream of integers
        .reduce(0, (i1, i2) -> (i1 > i2) ? i1 : i2);
  }

  public static Optional<Integer> getMaxElementOptional(List<Integer> integerList) {
    return integerList.stream().reduce((i1, i2) -> (i1 > i2) ? i1 : i2);
  }

  public static int getMinElement(List<Integer> integerList) {
    return integerList.stream()
        // avoid assigning a default when performing min and max value from a stream of integers
        .reduce(0, (i1, i2) -> (i1 > i2) ? i2 : i1);
  }

  public static Optional<Integer> getMinElementOptional(List<Integer> integerList) {
    return integerList.stream().reduce((i1, i2) -> (i1 > i2) ? i2 : i1);
  }

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
    // List<Integer> integerList = new ArrayList<>();
    System.out.println("Max element is: " + getMaxElement(integerList));

    Optional<Integer> maxValueOptional = getMaxElementOptional(integerList);
    System.out.println("Optional max is: " + maxValueOptional);

    if (getMaxElementOptional(integerList).isPresent()) {
      System.out.println("Max element using optional: " + getMaxElementOptional(integerList).get());
    } else {
      System.out.println("No max element found");
    }

    System.out.println("Minimum element is: " + getMinElement(integerList));
    Optional<Integer> minValueOptional = getMinElementOptional(integerList);
    System.out.println("Optional min is: " + minValueOptional);

    if (getMinElementOptional(integerList).isPresent()) {
      System.out.println("Min element using optional: " + getMinElementOptional(integerList).get());
    } else {
      System.out.println("No min element found");
    }
  }
}
