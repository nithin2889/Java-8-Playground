package com.playground.functionalInterfaces;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {
  BiPredicate<Integer, Double> biPredicate =
      (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

  BiConsumer<String, List<String>> studentBiConsumer =
      (name, activities) -> {
        System.out.println("name: " + name + " activities: " + activities);
      };

  Consumer<Student> studentConsumer = (student -> {
    if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
      studentBiConsumer.accept(student.getName(), student.getActivities());
    }
  });

  public void printNameAndActivities(List<Student> studentList) {
    studentList.forEach(studentConsumer);
  }

  public static void main(String[] args) {
    List<Student> studentList = StudentDatabase.getAllStudents();
    new BiPredicateExample().printNameAndActivities(studentList);
  }
}
