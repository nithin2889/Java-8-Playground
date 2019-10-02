package com.playground.streams.operations;

import com.playground.data.StudentDatabase;

public class StreamsMatchExample {

  // 1. checks if all the students in the stream matches the predicate
  public static boolean allMatch() {
    return StudentDatabase.getAllStudents().stream().allMatch(student -> student.getGpa() >= 3.9);
  }

  // 2. checks if any student in the stream matches the predicate
  public static boolean anyMatch() {
    return StudentDatabase.getAllStudents().stream().anyMatch(student -> student.getGpa() >= 4.0);
  }

  // 3. checks if none of the student in the stream matches the predicate
  public static boolean noneMatch() {
    return StudentDatabase.getAllStudents().stream().noneMatch(student -> student.getGpa() >= 4.0);
  }

  public static void main(String[] args) {
    System.out.println("Result of all match: " + allMatch());
    System.out.println("Result of any match: " + anyMatch());
    System.out.println("Result of none match: " + noneMatch());
  }
}
