package com.playground.constructorreference;

import java.util.function.Consumer;

public class LambdaVariableExample2 {

  // instance variable has no restrictions
  static int value = 4;

  public static void main(String[] args) {
    // local variable
    int value = 4;
    Consumer<Integer> c1 =
        i -> {
          // value++;
          System.out.println(value + i);
        };
    // value = 6;
    c1.accept(4);
  }
}
