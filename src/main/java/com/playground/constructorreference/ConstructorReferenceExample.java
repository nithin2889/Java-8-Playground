package com.playground.constructorreference;

import com.playground.data.Student;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

  // To call Student::new, we need to have an empty constructor in Student class.
  private static Supplier<Student> studentSupplier = Student::new;

  private static Function<String, Student> studentFunction = Student::new;

  public static void main(String[] args) {
    System.out.println(studentSupplier.get());
    System.out.println(studentFunction.apply("Nithin"));
  }
}
