package com.playground.methodreference;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

  private static Consumer<Student> consumerUsingLambdas = student -> System.out.println(student);
  // className::methodName
  private static Consumer<Student> consumerUsingMethodReference = System.out::println;
  // className::instanceMethodName
  private static Consumer<Student> consumerToPrintListOfActivities = Student::printListOfActivities;

  public static void main(String[] args) {
    StudentDatabase.getAllStudents().forEach(consumerUsingLambdas);
    System.out.println();
    StudentDatabase.getAllStudents().forEach(consumerUsingMethodReference);
    System.out.println();
    StudentDatabase.getAllStudents().forEach(consumerToPrintListOfActivities);
  }
}
