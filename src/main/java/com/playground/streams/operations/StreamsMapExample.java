package com.playground.streams.operations;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamsMapExample {

  public static List<String> getNamesList() {
    // 1. collect all the student names in a list and print them in the console.
    return StudentDatabase.getAllStudents().stream() // Stream<Student>
        // Student as an input -> Student name as an output
        .map(Student::getName) // Stream<String>
        .map(String::toUpperCase) // Stream<String> -> uppercase operation on each input
        .collect(Collectors.toList()); // List<String>
  }

  public static Set<String> getNamesSet() {
    // 1. collect all the student names in a list and print them in the console.
    return StudentDatabase.getAllStudents().stream() // Stream<Student>
        // Student as an input -> Student name as an output
        .map(Student::getName) // Stream<String>
        .map(String::toUpperCase) // Stream<String> -> uppercase operation on each input
        .collect(Collectors.toSet()); // Set<String>
  }

  public static Collection<String> getNamesCollection() {
    // 1. collect all the student names in a list and print them in the console.
    return StudentDatabase.getAllStudents().stream() // Stream<Student>
        // Student as an input -> Student name as an output
        .map(Student::getName) // Stream<String>
        .map(String::toUpperCase) // Stream<String> -> uppercase operation on each input
        .collect(Collectors.toCollection(LinkedHashSet::new)); // LinkedHashSet<String>
  }

  public static void main(String[] args) {
    System.out.println("List of names: " + getNamesList());
    System.out.println("Set of names: " + getNamesSet());
    System.out.println("Collection of names: " + getNamesCollection());
  }
}
