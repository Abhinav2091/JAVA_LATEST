package streams;

import bean.Instructor;
import bean.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAndAverageExample {
    public static void main(String[] args) {

        //grouping by the instructors into online and offline basis
        //and get the max of both of them
        Map<Boolean, Optional<Instructor>> resultMap1 = Instructors.getAll().stream().collect(
                Collectors.groupingBy(Instructor::isOnlineCourses, Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExp)))
        );
        //it return optional
        resultMap1.forEach((key, value) -> System.out.println("Key:" + key + " value:" + value));

        System.out.println("-----------------------");
        //colletingAnd then
        Map<Boolean, Instructor> resultMap2 = Instructors.getAll().stream().collect(
                Collectors.groupingBy(Instructor::isOnlineCourses,Collectors.collectingAndThen( Collectors.maxBy(Comparator.comparing(
                        Instructor::getYearOfExp)),Optional::get)));
        resultMap2.forEach((key, value) -> System.out.println("Key:" + key + " value:" + value));


        System.out.println("-----------------------");
        //grouping by the instructors into online and offline basis
        //and get the staticatial result
        Map<Boolean, IntSummaryStatistics> resultMap3 = Instructors.getAll().stream().collect(
                Collectors.groupingBy(Instructor::isOnlineCourses, Collectors.summarizingInt(Instructor::getYearOfExp))
        );
        resultMap3.forEach((key, value) -> System.out.println("Key:" + key + " value:" + value));


    }
}
