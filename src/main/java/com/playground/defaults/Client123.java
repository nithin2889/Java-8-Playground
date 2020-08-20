package com.playground.defaults;

public class Client123 implements Interface1, Interface2, Interface3 {

  public static void main(String[] args) {

    Client123 client123 = new Client123();
    client123.methodA(); // resolves to child Interface implementation
    client123.methodB();
    client123.methodC();
  }

  //overriding the default method in the implementation class.
  public void methodA() {
    System.out.println("Inside method A " + Client123.class);
  }
}
