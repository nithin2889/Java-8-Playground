package com.playground.streams.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamsRangesExample {
  public static void main(String[] args) {
    System.out.println("Int Stream:");
    IntStream intStream = IntStream.range(1, 50);
    System.out.println("int stream range count: " + intStream.count());
    IntStream.range(1, 50).forEach(value -> System.out.print(value + ","));
    System.out.println();
    System.out.println("int stream range closed count: " + IntStream.rangeClosed(1, 50).count());
    IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
    System.out.println();
    System.out.println("Long Stream:");
    LongStream longStream = LongStream.range(1, 50);
    System.out.println("long stream range count: " + longStream.count());
    LongStream.range(1, 50).forEach(value -> System.out.print(value + ","));
    System.out.println();
    System.out.println("long stream range closed count: " + LongStream.rangeClosed(1, 50).count());
    LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
    System.out.println();
    System.out.println("Double Stream:");
    IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(value + ","));
  }
}
