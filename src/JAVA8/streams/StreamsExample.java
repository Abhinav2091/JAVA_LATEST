package JAVA8.streams;
/**
 * streams can only be iterate once
 * <p>
 * streams will not get called until we have a terminal operation called
 * <p>
 *
 */

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        //creating a map of names and list of courses and have more than 5 year of experience and teaches online
        List<Instructor> instructorList = Instructors.getAll();
        //predicate to filter years of Exp
        Predicate<Instructor> yearsOfExpPredicate = (instructor) -> instructor.getYearOfExp() > 5;
        //predicate to filter online courses
        Predicate<Instructor> teachesOnline = Instructor::isOnlineCourses;

        Map<String, List<String>> resultMap = instructorList.stream()
                .filter(yearsOfExpPredicate.and(teachesOnline))
                //.peek(System.out::println) //peek is used to see what is left after filter operation is performed
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
        System.out.println(resultMap);


        List<String> namesList = Arrays.asList("Abhinav", "Abhi", "Raj");
        Stream<String> streams = namesList.stream();

        streams.forEach(System.out::println);
        //this will throw an error
        //as we can iterate stream only once
        // streams.forEach(System.out::println);




    }

}
