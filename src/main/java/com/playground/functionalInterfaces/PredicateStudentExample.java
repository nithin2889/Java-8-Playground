package com.playground.functionalInterfaces;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

  static List<Student> studentList = StudentDatabase.getAllStudents();

  /** Predicate to check for a student grade level and his GPA. */
  static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;

  static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

  /** Predicate AND example */
  private static void predicateANDFilterStudents() {
    System.out.println("predicateANDFilterStudents: ");
    studentList.forEach(
        student -> {
          if (p1.and(p2).test(student)) {
            System.out.println(student);
          }
        });
  }

  /** Predicate OR example */
  private static void predicateORFilterStudents() {
    System.out.println("predicateORFilterStudents: ");
    studentList.forEach(
        student -> {
          if (p1.or(p2).test(student)) {
            System.out.println(student);
          }
        });
  }

  /** Predicate NEGATE example */
  private static void predicateNEGATEFilterStudents() {
    System.out.println("predicateNEGATEFilterStudents: ");
    studentList.forEach(
        student -> {
          if (p1.or(p2).negate().test(student)) {
            System.out.println(student);
          }
        });
  }

  public static void main(String[] args) {
    predicateANDFilterStudents();
    predicateORFilterStudents();
    predicateNEGATEFilterStudents();
  }
}
