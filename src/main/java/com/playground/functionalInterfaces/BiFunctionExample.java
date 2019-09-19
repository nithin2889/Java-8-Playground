package com.playground.functionalInterfaces;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

  /**
   * BiFunction takes in two inputs. First one is the list of students, and second one is the
   * predicate. Output will be a map of student names and their respective GPA's.
   */
  static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =
      ((studentList, studentPredicate) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();

        studentList.forEach(
            student -> {
              if (studentPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
              }
            });

        return studentGradeMap;
      });

  public static void main(String[] args) {
    System.out.println(
        biFunction.apply(
            StudentDatabase.getAllStudents(),
            PredicateStudentExample.p1.and(PredicateStudentExample.p2)));
  }
}
