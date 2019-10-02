package com.playground.streams.operations;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

  // 1. Filtering students based on gender
  public static List<Student> filterStudents() {
    return StudentDatabase.getAllStudents().stream() // Stream<Student>
        // filters and sends only female students
        .filter(student -> student.getGender().equals("female")) // Stream<Student>
        .filter(student -> student.getGpa() >= 3.9)
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    // System.out.println("filterStudents(): " + filterStudents());
    filterStudents().forEach(System.out::println);
  }
}
