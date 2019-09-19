package com.playground.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

  static UnaryOperator<String> unaryOperator = s -> s.concat(" by default");

  public static void main(String[] args) {
    System.out.println(unaryOperator.apply("java 8"));
  }
}
