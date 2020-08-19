package com.playground.optional;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.Optional;

public class OptionalExample {

  public static String getStudentName() {
    // Student student = StudentDataBase.studentSupplier.get();
    Student student = null;
    if (student != null) {
      return student.getName();
    } else {
      return null;
    }
  }

  public static Optional<String> getStudentNameOptional() {

    Optional<Student> student = Optional.ofNullable(StudentDatabase.studentSupplier.get());
    //Optional<Student> student = Optional.ofNullable(null);

    if (student.isPresent()) {
      // don't get confused this with streams map method. Both are different.
      return student.map(Student::getName);
    }
    return Optional.empty();
  }

  public static void main(String[] args) {

    if (getStudentNameOptional().isPresent()) {
      System.out.println(getStudentNameOptional().get());
    } else {
      System.out.println("Name is returned as empty.");
    }
  }
}
