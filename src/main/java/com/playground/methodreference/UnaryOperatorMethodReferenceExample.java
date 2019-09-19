package com.playground.methodreference;

import java.util.function.UnaryOperator;

public class UnaryOperatorMethodReferenceExample {

  static UnaryOperator<String> toUpperCaseLambda = s -> s.toUpperCase();

  static UnaryOperator<String> toUpperCaseMethodReference = String::toUpperCase;

  public static void main(String[] args) {
    System.out.println("Using Lambdas: " + toUpperCaseLambda.apply("java 8"));
    System.out.println("Using method reference: " + toUpperCaseMethodReference.apply("java 8"));
  }
}
