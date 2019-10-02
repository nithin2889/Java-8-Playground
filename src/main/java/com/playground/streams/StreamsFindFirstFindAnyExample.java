package com.playground.streams;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.Optional;

public class StreamsFindFirstFindAnyExample {

  public static Optional<Student> findAnyStudent() {
    return StudentDatabase.getAllStudents().stream()
        // adam, jenny, emily (as soon as it found a student with the filter criteria it returned
        // that student and it did not execute any of the student present after it matched the
        // criteria)
        .filter(student -> student.getGpa() >= 3.9)
        .findAny();
  }

  public static Optional<Student> findFirstStudent() {
    return StudentDatabase.getAllStudents().stream()
        .filter(student -> student.getGpa() >= 3.9)
        .findFirst();
  }

  public static void main(String[] args) {
    Optional<Student> studentOptional1 = findAnyStudent();
    if (studentOptional1.isPresent()) {
      System.out.println("Found the student: " + studentOptional1.get());
    } else {
      System.out.println("Student not found");
    }

    Optional<Student> studentOptional2 = findFirstStudent();
    if (studentOptional2.isPresent()) {
      System.out.println("Found the student: " + studentOptional2.get());
    } else {
      System.out.println("Student not found");
    }
  }
}
