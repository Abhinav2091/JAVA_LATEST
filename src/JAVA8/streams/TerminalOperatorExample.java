package JAVA8.streams;

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * joining return stream as string joining
 * <p>
 * joining()
 * <p>
 * joining("delimiter")
 * <p>
 * joining("delimiter","prefix","suffix")
 * <p>
 * * counting()-->counts the no of element in stream
 * * <p>
 * * helpfull in downstream operataions
 * * eg:  groupBy(String::length,counting())
 * <p>
 * <p>
 * mapping()-->takes method and another collector and create a new collector which apply the function
 * and then collect the mapped element using the given collector
 * <p>
 * <p>
 * Optional minBy(Comparator comparator)
 * Optional maxBy(Comparator comparator)
 * <p>
 * summingInt()
 * averageInt()
 */
public class TerminalOperatorExample {
    public static void main(String[] args) {
        Stream<String> inputStream = Stream.of("A", "B", "C", "D", "E");
        String result = inputStream.collect(Collectors.joining());
        System.out.println(result);

        inputStream = Stream.of("A", "B", "C", "D", "E");
        System.out.println("---------------------");
        String result1 = inputStream.collect(Collectors.joining(","));
        System.out.println(result1);


        inputStream = Stream.of("A", "B", "C", "D", "E");
        System.out.println("---------------------");
        String result2 = inputStream.collect(Collectors.joining(",", "{", "}"));
        System.out.println(result2);

        //print Instructor name seperated by , prefix { suffix }
        System.out.println("---------------------");
        String result3 = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.joining(",", "{", "}"));
        System.out.println(result3);


        System.out.println("---------------------");
        //count the no of instructor who teaches online courses
        Long count = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).collect(Collectors.counting());
        System.out.println("count = " + count);


        System.out.println("---------------------");
        //mapping()
        //collect the name
        List<String> nameList = Instructors.getAll().stream().collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        System.out.println(nameList.stream().collect(Collectors.joining(",")));

        System.out.println("---------------------");
        //group instructor by year of Exp
        Map<Integer, List<String>> resultMap = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getYearOfExp,
                Collectors.mapping(Instructor::getName, Collectors.toList())));
        resultMap.forEach((key, value) -> {
            System.out.println("key = " + key + " value =" + value);
        });

        System.out.println("minBy()---------------------");
        Optional<Instructor> minExp = Instructors.getAll().stream().collect(Collectors.minBy(Comparator.comparing(Instructor::getYearOfExp)));
        minExp.ifPresent(System.out::println);

        System.out.println("maxBy()---------------------");
        Optional<Instructor> maxExp = Instructors.getAll().stream().collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExp)));
        maxExp.ifPresent(System.out::println);

        System.out.println("summingInt()---------------------");
        int summingInt = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearOfExp));
        System.out.println(summingInt);

        System.out.println("averagingInt()---------------------");
        double averagingInt = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearOfExp));
        System.out.println(averagingInt);


    }
}
