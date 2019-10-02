package com.playground.streams;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
  // 1. print all the activities in a list
  public static List<String> getStudentActivities() {
    return StudentDatabase.getAllStudents().stream() // Stream<Student>
        .map(Student::getActivities) // Stream<List<String>>
        .flatMap(List::stream) // Stream<String>
        .distinct() // Stream<String>
        .collect(Collectors.toList());
  }

  public static long getStudentActivitiesCount() {
    return StudentDatabase.getAllStudents().stream() // Stream<Student>
        .map(Student::getActivities) // Stream<List<String>>
        .flatMap(List::stream) // Stream<String>
        .distinct() // Stream<String> with distinct function performed
        .count();
  }

  public static List<String> getStudentActivitiesSorted() {
    return StudentDatabase.getAllStudents().stream() // Stream<Student>
        .map(Student::getActivities) // Stream<List<String>>
        .flatMap(List::stream) // Stream<String>
        .distinct() // Stream<String> with distinct function performed
        .sorted()
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println("getStudentActivities(): " + getStudentActivities());
    System.out.println("getStudentActivitiesCount(): " + getStudentActivitiesCount());
    System.out.println("getStudentActivitiesSorted(): " + getStudentActivitiesSorted());
  }
}
