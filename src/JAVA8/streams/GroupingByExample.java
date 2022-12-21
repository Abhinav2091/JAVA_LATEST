package JAVA8.streams;

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * groupingBY()-->similar to SQL grouping
 * <p>
 * output is Map<Key,Value>
 * <p>
 * groupingBy(classifier)
 * groupingBy(classifier,downstream)
 * groupingBy(classifier,mapfactory,downstream)
 */
public class GroupingByExample {
    public static void main(String[] args) {

        System.out.println("groupingBy(classifier)");
        List<String> instructorNameList = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toList());
        //group instructor by their name length
        Map<Integer, List<String>> resultMap1 = instructorNameList.stream().collect(Collectors.groupingBy(String::length));
        resultMap1.forEach((key, value) -> {
            System.out.println("key:" + key + " value:" + value);
        });


        System.out.println("-----------------------");
        //grouping by there gender
        Map<String, List<Instructor>> resultMap2 = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getGender));
        resultMap2.forEach((key, value) -> {
            System.out.println("key:" + key + " value:" + value);
        });

        System.out.println("-----------------------");
        //grouping by experience where more than 5 is classiefied as senior and others as junior
        Map<String, List<Instructor>> resultMap3 = Instructors.getAll().stream().collect(Collectors.groupingBy(instructor ->
                instructor.getYearOfExp() > 5 ? "SENIOR" : "JUNIOR"));
        resultMap3.forEach((key, value) -> {
            System.out.println("key:" + key + " value:" + value);
        });

        System.out.println("########################################################");
        System.out.println("groupingBy(classifier,downstream)");
        System.out.println("-----------------------");
        //grouping by length of name string and if it containes e only then ddo the grouping
        Map<Integer, List<String>> resultMap4 = instructorNameList.stream().collect(Collectors.groupingBy(String::length, Collectors.filtering(s ->
                s.contains("e"), Collectors.toList())));

        resultMap4.forEach((key, value) -> System.out.println("Key:" + key + " value:" + value));

        System.out.println("-----------------------");
        //group instructor by senior>5 and junior<5
        //and filter them by online courses
        Map<String, List<Instructor>> resultMap5 = Instructors.getAll().stream().collect(Collectors.groupingBy(instructor ->
                instructor.getYearOfExp() > 5 ? "SENIOR" : "JUNIOR", Collectors.filtering(Instructor::isOnlineCourses, Collectors.toList())));
        resultMap5.forEach((key, value) -> System.out.println("Key:" + key + " value:" + value));


        System.out.println("########################################################");
        System.out.println("groupingBy(classifier,mapfactory,downstream)");
        System.out.println("-----------------------");
        //grouping by length of name string and if it containes e only then ddo the grouping and take a result as linkedhashmap
        LinkedHashMap<Integer, List<String>> resultMap6 = instructorNameList.stream().collect(Collectors.groupingBy(String::length, LinkedHashMap::new
                , Collectors.filtering(s ->
                        s.contains("e"), Collectors.toList())));

        resultMap6.forEach((key, value) -> System.out.println("Key:" + key + " value:" + value));

        System.out.println("-----------------------");
        //group instructor by senior>5 and junior<5
        //and filter them by online courses and take a result as linkedhashmap
        LinkedHashMap<String, List<Instructor>> resultMap7 = Instructors.getAll().stream().collect(Collectors.groupingBy(instructor ->
                instructor.getYearOfExp() > 5 ? "SENIOR" : "JUNIOR", LinkedHashMap::new, Collectors.filtering(Instructor::isOnlineCourses, Collectors.toList())));
        resultMap7.forEach((key, value) -> System.out.println("Key:" + key + " value:" + value));
    }
}
