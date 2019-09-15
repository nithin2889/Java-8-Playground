package com.playground.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

  // Function to convert the names to upper case
  static Function<String, String> fn1 = name -> name.toUpperCase();
  // Function to convert the names to upper case and concatenate an additional string.
  static Function<String, String> fn2 =
      name -> name.toUpperCase().concat(" functional programming");

  public static void main(String[] args) {
    System.out.println("Result is: " + fn1.apply("java 8"));

    System.out.println("Result of andThen is: " + fn1.andThen(fn2).apply("java 8"));

    System.out.println("Result of compose is: " + fn1.compose(fn2).apply("java 8"));
  }
}
