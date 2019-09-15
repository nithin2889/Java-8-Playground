package com.playground.functionalInterfaces;

import com.playground.data.Student;
import com.playground.data.StudentDatabase;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

  /** BiConsumer example to print name and the list of activities of a student */
  public static void printNameAndActivities() {
    BiConsumer<String, List<String>> biConsumer =
        (name, activities) -> System.out.println("name: " + name + " activities: " + activities);
    List<Student> studentList = StudentDatabase.getAllStudents();
    studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
  }

  public static void main(String[] args) {
    BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + ", b: " + b);
    biConsumer.accept("java 7", "java 8");

    /** BiConsumer example to multiply two integers */
    BiConsumer<Integer, Integer> multiply = (i1, i2) -> System.out.println(i1 * i2);

    /** BiConsumer example to divide two integers */
    BiConsumer<Integer, Integer> divide = (i1, i2) -> System.out.println(i1 / i2);

    /** BiConsumer andThen example */
    multiply.andThen(divide).accept(10, 5);

    printNameAndActivities();
  }
}
