package com.playground.streams.terminal;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.stream.Collectors;

public class StreamsJoiningExample {

  public static String joining() {

    return StudentDatabase.getAllStudents().stream()
        .map(Student::getName)
        .collect(Collectors.joining()); // appends all the strings to produce the output,
  }

  public static String joiningWithDelimiter() {

    return StudentDatabase.getAllStudents().stream()
        .map(Student::getName)
        .collect(Collectors.joining("-"));
  }

  public static String joiningWithDelimiterWithPrefix() {

    return StudentDatabase.getAllStudents().stream()
        .map(Student::getName)
        .collect(Collectors.joining("-", "[", "]"));
  }

  public static void main(String[] args) {

    System.out.println("Names : " + joining());
    System.out.println("Names With Delimiter : " + joiningWithDelimiter());
    System.out
        .println("Names With Delimiter Prefix and Suffix : " + joiningWithDelimiterWithPrefix());
  }
}
