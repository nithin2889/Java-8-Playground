package com.playground.streams.operations;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
  public static void main(String[] args) {
    // Collections allow you to add, modify or remove elements from it after it is created
    ArrayList<String> names = new ArrayList<>();
    names.add("Adam");
    names.add("Jim");
    names.add("Jenny");

    // collections can be traversed "n" number of times
    for (String name: names) {
      System.out.println(name);
    }

    for (String name: names) {
      System.out.println(name);
    }

    names.remove(0);
    System.out.println(names);

    // Streams doesn't allow you to add, modify or remove elements from the stream once it is
    // created
    Stream<String> nameStream = names.stream();
    nameStream.forEach(System.out::println);
    nameStream.forEach(System.out::println); // IllegalStateException occurs
  }
}
