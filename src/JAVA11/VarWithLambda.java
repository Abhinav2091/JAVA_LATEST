package JAVA11;

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;

import java.util.function.Predicate;

public class VarWithLambda {
    public static void main(String[] args) {
        var instructorList = Instructors.getAll();
        Predicate<Instructor> predicate = (var instructor) -> instructor.getYearOfExp() > 5;
        instructorList.stream().filter(predicate).forEach((var instructor) -> {
            System.out.println(instructor.getName());
        });
    }
}
