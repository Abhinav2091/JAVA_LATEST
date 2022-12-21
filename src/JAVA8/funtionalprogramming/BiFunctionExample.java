package JAVA8.funtionalprogramming;

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * takes two argument as input and one output
 * <p>
 * it does not have compose method
 */
public class BiFunctionExample {
    public static void main(String[] args) {
        System.out.println("--------------");
        List<Instructor> instructorList = Instructors.getAll();
        //predicate that return if teaches online
        Predicate<Instructor> predicate = Instructor::isOnlineCourses;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, List<String>>> biFunction1 = (instructors, instructorPredicate) -> {
            Map<String, List<String>> resultMap = new HashMap<>();
            instructorList.forEach(instructor -> {
                if (predicate.test(instructor))
                    resultMap.put(instructor.getName(), instructor.getCourses());
            });

            return resultMap;
        };
        System.out.println(biFunction1.apply(instructorList, predicate));

    }
}
