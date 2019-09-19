package com.playground.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

  private static Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);

  private static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

  private static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

  private static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

  public static void main(String[] args) {
    System.out.println("Product of two integers is: " + binaryOperator.apply(3, 4));
    System.out.println("Max of the given two inputs: " + maxBy.apply(4, 5));
    System.out.println("Min of the given two inputs: " + minBy.apply(4, 5));
  }
}
