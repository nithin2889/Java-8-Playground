package com.playground.lambdas;

public class RunnableLambdaExample {
  public static void main(String[] args) {
    /** before java 8 */
    Runnable runnable =
        new Runnable() {
          @Override
          public void run() {
            System.out.println("Inside runnable example");
          }
        };
    new Thread(runnable).start();

    /** java 8 */
    Runnable runnableLambda =
        () -> {
          System.out.println("inside runnable lambda example");
        };
    new Thread(runnableLambda).start();
  }
}
