package com.playground.functionalInterfaces;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

  /**
   * Function that takes in a list of students as input and
   * outputs a hash map of student names and their GPA.
   */
  private static Function<List<Student>, Map<String, Double>> studentFn =
      (students) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(
            student -> {
              /**
               * Accessing a predicate from an external class and
               * display those whose grade level is >= 3
               */
              if (PredicateStudentExample.p1.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
              }
            });
        return studentGradeMap;
      };

  public static void main(String[] args) {
    System.out.println(studentFn.apply(StudentDatabase.getAllStudents()));
  }
}
