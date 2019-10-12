package com.playground.streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

  /**
   * use case: calculate the sum of N numbers
   *
   * problem: we are passing a List<Integer> and Integer is a wrapper class for the int primitive
   * type. Under the hood, it performs an unboxing operation to convert the Integer to int. There is
   * some wasted effort. Every time the stream passes the element it performs an unboxing of Integer
   * wrapper class to int primitive type, performs the summation and returns the sum. To avoid this
   * IntStream comes into picture.
   */
  public static int sumOfNNumbers(List<Integer> integerList) {
    return integerList.stream().reduce(0, (i1, i2) -> i1 + i2);
  }

  public static int sumOfNNumberIntStream() {
    return IntStream.rangeClosed(1, 6) // gives 1, 2, 3, 4, 5, 6
        .sum();
  }

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
    System.out.println("sum of N numbers: " + sumOfNNumbers(integerList));

    System.out.println("sum of N numbers using IntStream: " + sumOfNNumberIntStream());
  }
}
