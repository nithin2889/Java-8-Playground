package com.playground.streams;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
  // 1. Sort the Students and print the result in the alphabetical order
  public static List<Student> sortStudentsByName() {
    return StudentDatabase.getAllStudents().stream()
        .sorted(Comparator.comparing(Student::getName))
        .collect(Collectors.toList());
  }

  public static List<Student> sortStudentsByGpa() {
    return StudentDatabase.getAllStudents().stream()
        .sorted(Comparator.comparing(Student::getGpa))
        .collect(Collectors.toList());
  }

  public static List<Student> sortStudentsByGpaDesc() {
    return StudentDatabase.getAllStudents().stream()
        .sorted(Comparator.comparing(Student::getGpa).reversed())
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println("sortStudentsByName(): " + sortStudentsByName());
    System.out.println("sortStudentsByGpa(): " + sortStudentsByGpa());
    System.out.println("sortStudentsByGpaDesc(): " + sortStudentsByGpaDesc());
  }
}
