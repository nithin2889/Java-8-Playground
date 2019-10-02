package com.playground.streams;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

  static Predicate<Student> studentGradeLevelPredicate = student -> student.getGradeLevel() >= 3;
  static Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;

  public static void main(String[] args) {
    // 1. Student and their list of activities in a Map.
    // 2. Want just the students who are in the grade level greater than or equal to 3.
    Map<String, List<String>> studentMap =
        // 3. debugging stream operations using peek()
        StudentDatabase.getAllStudents().stream()
            .filter(studentGradeLevelPredicate) // Stream<Student>
            .filter(studentGpaPredicate) // Stream<Student>
            .peek(System.out::println)
            .collect(
                Collectors.toMap(
                    Student::getName, Student::getActivities)); // Map<String, List<String>>
    System.out.println(studentMap);
  }
}
