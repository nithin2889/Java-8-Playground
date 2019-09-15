package com.playground.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

  /** Predicate for checking a number divisible by 2 and 5 */
  static Predicate<Integer> p1 = i -> i % 2 == 0;

  static Predicate<Integer> p2 = i -> i % 5 == 0;

  /** Predicate AND example */
  private static void predicateAnd() {
    System.out.println("Predicate AND result: " + p1.and(p2).test(10));
  }

  /** Predicate OR example */
  private static void predicateOr() {
    System.out.println("Predicate OR result: " + p1.or(p2).test(5));
  }

  /** Predicate NEGATE example */
  private static void predicateNegate() {
    System.out.println("Predicate NEGATE result: " + p1.or(p2).negate().test(7));
  }

  public static void main(String[] args) {
    System.out.println(p1.test(4));
    predicateAnd();
    predicateOr();
    predicateNegate();
  }
}
