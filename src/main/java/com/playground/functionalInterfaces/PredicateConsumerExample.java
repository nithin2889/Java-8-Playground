package com.playground.functionalInterfaces;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

  /** Predicate for checking grade level and GPA */
  Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

  Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

  /** BiConsumer for printing student name and the list of activities */
  BiConsumer<String, List<String>> studentBiConsumer =
      (name, activities) -> {
        System.out.println("name: " + name + " activities: " + activities);
      };

  /** Predicate and Consumer example */
  Consumer<Student> studentConsumer =
      (student -> {
        if (p1.and(p2).test(student)) {
          studentBiConsumer.accept(student.getName(), student.getActivities());
        }
      });

  /**
   * Method to print the student names and the list of activities
   *
   * @param studentList
   */
  private void printNameAndActivities(List<Student> studentList) {
    studentList.forEach(studentConsumer);
  }

  public static void main(String[] args) {
    List<Student> studentList = StudentDatabase.getAllStudents();
    new PredicateConsumerExample().printNameAndActivities(studentList);
  }
}
