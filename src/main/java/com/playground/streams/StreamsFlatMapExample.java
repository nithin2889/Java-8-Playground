package com.playground.streams;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
  // print all the activities in a list
  public static List<String> getStudentActivities() {
    return StudentDatabase.getAllStudents().stream() // Stream<Student>
        .map(Student::getActivities) // Stream<List<String>>
        .flatMap(List::stream) // Stream<String>
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println("getStudentActivities(): " + getStudentActivities());
  }
}
