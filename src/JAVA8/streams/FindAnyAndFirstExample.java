package JAVA8.streams;

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;

import java.util.Optional;

/**
 * findFirst()
 * findAny()
 */

public class FindAnyAndFirstExample {
    public static void main(String[] args) {

        Optional<Instructor> instructor = Instructors.getAll().stream().findAny();
        instructor.ifPresent(System.out::println);

        Optional<Instructor> instructor1 = Instructors.getAll().stream().findFirst();
        instructor1.ifPresent(System.out::println);
    }
}
