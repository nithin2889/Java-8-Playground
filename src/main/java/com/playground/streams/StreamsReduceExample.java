package com.playground.streams;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

  // 1. multiplication of all the numbers as a result
  public static int performMultiplication(List<Integer> integerList) {
    return integerList.stream()
        // a=1 (identity value), b=1 (from stream) => 1
        // a=1 (from result), b=3 (from stream) => 3
        // a=3 (from result), b=5 (from stream) => 15
        // a=15 (from result), b=7 (from stream) => 105
        .reduce(1, (i1, i2) -> i1 * i2);
  }

  public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
    return integerList.stream().reduce((i1, i2) -> i1 * i2);
  }

  // print the student who has the highest GPA
  public static Optional<Student> getHighestGPAStudent() {
    return StudentDatabase.getAllStudents().stream()
        // Gets the students from the stream one by one.
        // The GPA condition here is the key factor which determines which student has the highest
        // GPA and then it compares that with each and every value that is passed out of the stream
        // and then it maintains the student with the highest grade.
        .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
  }

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 3, 5, 7);
    List<Integer> integers1 = new ArrayList<>();

    System.out.println("product of all the numbers: " + performMultiplication(integers));

    Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
    System.out.println("List with elements: ");
    System.out.println(result.isPresent());
    System.out.println(result.get());

    Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);
    System.out.println("List without elements: ");
    System.out.println(result1.isPresent());
    if (result1.isPresent()) {
      System.out.println(result.get());
    }

    if (getHighestGPAStudent().isPresent()) {
      System.out.println("Highest GPA Student: " + getHighestGPAStudent().get());
    }
  }
}
