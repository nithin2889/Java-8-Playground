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
          // not allowed to modify any local variables that is being referenced in the lambda scope.
          // value++;
          System.out.println(value + i);
        };
    /*
      even though you are not modifying the variable within the lambda scope you are still not
      allowed to modify within the method scope.
    */
    // value = 6;
    c1.accept(4);
  }
}
