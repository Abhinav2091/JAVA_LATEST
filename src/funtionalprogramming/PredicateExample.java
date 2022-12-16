package funtionalprogramming;

import bean.Instructor;
import bean.Instructors;

import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/**
 * it is single argument function which returns boolean value
 * <p>
 * test() is abstract method
 *
 * IntPredicate,LongPredicate,DoublePredicate
 */
public class PredicateExample {
    public static void main(String[] args) {
        //if no is greater than 2
        Predicate<Integer> predicate1 = x -> x > 2;
        System.out.println(predicate1.test(4));

        System.out.println("--------------");

        // number is greater than 2 and number is even
        Predicate<Integer> predicate2 = x -> x % 2 == 0;
        System.out.println(predicate1.and(predicate2).test(20));

        System.out.println("--------------");

        // number is greater than 2 || number is even
        System.out.println(predicate1.or(predicate2).test(5));

        System.out.println("--------------");

        // number is greater than 2 || number is odd
        //negate reverse the return value
        System.out.println(predicate1.and(predicate2.negate()).test(20));

        System.out.println("--------------");
        List<Instructor> instructorList = Instructors.getAll();
        //all instructor who teaches online

        Predicate<Instructor> predicate3 = Instructor::isOnlineCourses;

        //instructor experience greater than 5 year
        Predicate<Instructor> predicate4 = instructor -> instructor.getYearOfExp() > 5;

        instructorList.forEach(instructor -> {
            if (predicate3.test(instructor))
                System.out.println(instructor);
        });
        System.out.println("--------------");

        instructorList.forEach(instructor -> {
            if (predicate3.and(predicate4).test(instructor))
                System.out.println(instructor);
        });

        System.out.println("--------------");
        //Int predicate takes int input
        IntPredicate predicate5 =x->x>5;
        System.out.println(predicate5.test(4));

        System.out.println("--------------");
        //Long predicate takes Long input
        LongPredicate predicate6 = x->x>5L;
        System.out.println(predicate6.test(7L));

        System.out.println("--------------");
        //Double predicate takes double input
        DoublePredicate predicate7 = x->x>5.5;
        System.out.println(predicate7.test(5.6));



    }
}
