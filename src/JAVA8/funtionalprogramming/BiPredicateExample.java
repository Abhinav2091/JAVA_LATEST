package JAVA8.funtionalprogramming;

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;


import java.util.List;
import java.util.function.BiPredicate;

/**
 * BiPredicate -->takes two argument as input
 */
public class BiPredicateExample {
    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();
        //create predicate which checks if exp is more than 5 and teaches online
        BiPredicate<Integer, Boolean> biPredicate1 = (exp, isOnline) -> exp > 5 && isOnline;
        instructorList.forEach(instructor -> {
            if (biPredicate1.test(instructor.getYearOfExp(), instructor.isOnlineCourses()))
                System.out.println(instructor);
        });
    }
}
