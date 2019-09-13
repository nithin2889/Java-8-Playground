package com.playground.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
  public static void main(String[] args) {
    /**
     * before java 8
     */
    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
      }
    };
    System.out.println(comparator.compare(3,2));

    /**
     * java 8
     */
    Comparator<Integer> comparatorLambda = Integer::compareTo;
    System.out.println(comparatorLambda.compare(3,2));
  }
}
