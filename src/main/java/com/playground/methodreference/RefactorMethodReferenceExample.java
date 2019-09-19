package com.playground.methodreference;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

  private static Predicate<Student> predicateWithoutRefactoring =
      student -> student.getGradeLevel() >= 3;

  private static Predicate<Student> predicateWithRefactoring =
      RefactorMethodReferenceExample::greaterThanGradeLevel;

  private static boolean greaterThanGradeLevel(Student student) {
    return student.getGradeLevel() >= 3;
  }

  public static void main(String[] args) {
    System.out.println(
        "Before Refactoring: "
            + predicateWithoutRefactoring.test(StudentDatabase.studentSupplier.get()));
    System.out.println(
        "After Refactoring: "
            + predicateWithRefactoring.test(StudentDatabase.studentSupplier.get()));
  }
}
