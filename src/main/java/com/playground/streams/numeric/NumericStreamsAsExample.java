package com.playground.streams.numeric;

import java.util.stream.IntStream;

public class NumericStreamsAsExample {

  public static double asDoubleStream() {

    return IntStream.rangeClosed(1, 5)
        .asDoubleStream()
        .sum();
  }


  public static long asLongStream() {
    return IntStream.rangeClosed(1, 5)
        .asLongStream()
        .sum();

  }

  public static void main(String[] args) {
    System.out.println("asDoubleStream :" + asDoubleStream());
    System.out.println("asDoubleStream :" + asLongStream());
  }
}
