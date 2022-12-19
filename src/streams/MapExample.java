package streams;

import bean.Instructor;
import bean.Instructors;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Intermediate operation
 * map()-->used when we want to convert stream of x to y.
 * <p>
 * flatMap()-->combination of map and flat
 * used to flatten the stream
 * <p>
 * distinct()-->filter or collect distinct element from a collection
 * <p>
 * count()-->count of element in string
 * <p>
 * sorted()-->sorted according to natural order
 * <p>
 * anyMatch()-->return any element matches the provided predicate
 * <p>
 * allMatch()-->return all element of the stream matches the provided predicate
 * <p>
 * noneMatch()-->return whether no element of the stream matches the provided predicate
 */
public class MapExample {
    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();
        //return only instructer name using map()
        List<String> nameList = instructorList.stream().map(Instructor::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("map()-----------------");
        System.out.println(nameList);

        System.out.println("flatMap()-----------------");
        //use flat map to get all courses in one list

        Set<String> coursesList = instructorList.stream().map(Instructor::getCourses).flatMap(Collection::stream).collect(Collectors.toSet());
        System.out.println(coursesList);

        System.out.println("count(),distinct()-----------------");
        //count // distinct to remove duplicates
        Long coursesCount = instructorList.stream().map(Instructor::getCourses).flatMap(Collection::stream).distinct().count();
        System.out.println(coursesCount);

        System.out.println("distinct(),sorted()-----------------");
        // distinct to remove duplicates // and get in sortedOrder
        List<String> coursesList1 = instructorList.stream().map(Instructor::getCourses).flatMap(Collection::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(coursesList1);

        System.out.println("customized sorting()-----------------");
        // get customized sortedOrder in reverse order
        List<Instructor> coursesList2 = instructorList.stream().sorted(Comparator.comparing(Instructor::getName).reversed()).collect(Collectors.toList());
        System.out.println(coursesList2);

        System.out.println("anyMatch()-----------------");
        //anyMatch()
        boolean match = instructorList.stream().map(Instructor::getCourses).flatMap(Collection::stream).anyMatch(s -> s.startsWith("J"));
        System.out.println(match);

        System.out.println("allMatch()-----------------");
        //allMatch()
        boolean match1 = instructorList.stream().map(Instructor::getCourses).flatMap(Collection::stream).allMatch(s -> s.startsWith("J"));
        System.out.println(match1);

        System.out.println("noneMatch()-----------------");
        //noneMatch()
        boolean match2 = instructorList.stream().map(Instructor::getCourses).flatMap(Collection::stream).noneMatch(s -> s.startsWith("J"));
        System.out.println(match2);
    }
}

