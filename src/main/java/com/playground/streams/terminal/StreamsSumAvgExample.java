package com.playground.streams.terminal;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.stream.Collectors;

public class StreamsSumAvgExample {

  public static int sum() {

    int totalNoOfNotebooks = StudentDatabase
        .getAllStudents()
        .stream()
        .collect(Collectors.summingInt(Student::getNoteBooks));

    return totalNoOfNotebooks;
  }

  public static double average() {

    double totalNoOfNotebooks = StudentDatabase.getAllStudents()
        .stream()
        .collect(Collectors.averagingInt(Student::getNoteBooks));

    return totalNoOfNotebooks;
  }


  public static void main(String[] args) {
    System.out.println("Total no of Notebooks : " + sum());
    System.out.println("Average no of Notebooks : " + average());
  }
}
