package com.playground.functionalInterfaces;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

  static Consumer<String> c1 = string -> System.out.println(string.toUpperCase());
  static Consumer<Student> c2 = student -> System.out.println(student);
  static Consumer<Student> c3 = student -> System.out.print(student.getName());
  static Consumer<Student> c4 = student -> System.out.println(student.getActivities());

  static List<Student> studentList = StudentDatabase.getAllStudents();

  private static void printStudents() {
    System.out.println("printStudents():");
    studentList.forEach(c2);
  }

  private static void printNameAndActivities() {
    System.out.println("printNameAndActivities():");
    studentList.forEach(c3.andThen(c4));
  }

  private static void printNameAndActivitiesWithCondition() {
    System.out.println("printNameAndActivitiesWithCondition():");
    studentList.forEach(student -> {
      if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9 ) {
        c3.andThen(c4).accept(student);
      }
    });
  }

  public static void main(String[] args) {
    c1.accept("java 8");

    printStudents();
    printNameAndActivities();
    printNameAndActivitiesWithCondition();
  }
}
