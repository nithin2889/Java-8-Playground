package com.playground.functionalInterfaces;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

  public static void main(String[] args) {
    Supplier<Student> studentSupplier =
        () -> {
          return new Student(
              "Adam", 2, 4.0, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        };
    System.out.println("Student is: " + studentSupplier.get());

    Supplier<List<Student>> studentListSupplier = StudentDatabase::getAllStudents;
    System.out.println("Students are: " + studentListSupplier.get());
  }
}
