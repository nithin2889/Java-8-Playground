package com.playground.streams;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;

public class StreamsMapReduceExample {
  // 1. total number of notebooks the whole collection has
  public static int getNotebooksCount() {
    return StudentDatabase.getAllStudents().stream()
        // 2. filter to get the number of notebooks for students greater than 3
        .filter(student -> student.getGradeLevel() >= 3)
        // 3. filter for only female
        .filter(student -> student.getGender().equals("female"))
        .map(Student::getNoteBooks)
        .reduce(0, Integer::sum);
  }

  public static void main(String[] args) {
    System.out.println("Number of notebooks: " + getNotebooksCount());
  }
}
