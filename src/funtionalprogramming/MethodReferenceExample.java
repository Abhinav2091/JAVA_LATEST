package funtionalprogramming;

import bean.Instructor;
import bean.Instructors;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Reference to static Method
 * Class::staticMethod
 * <p>
 * Reference to an Instance Method
 * Object::instanceMethod
 * <p>
 * Reference to a Constructor
 * Class::new
 *
 * we can only use Constructor reference in the context of functional interface
 * we cannot an instance of class using above syntax
 * we can use above syntax by the interface must be functional interface
 */
public class MethodReferenceExample {

    public static void main(String[] args) {
        Predicate<Instructor> predicate1 = instructor -> instructor.isOnlineCourses();
        Predicate<Instructor> predicate2 = Instructor::isOnlineCourses;

        Function<Integer, Double> sqrt1 = n -> Math.sqrt(n);
        Function<Integer, Double> sqrt2 = Math::sqrt;

        UnaryOperator<String> unaryOperator1 = s -> s.toLowerCase();
        UnaryOperator<String> unaryOperator2 = String::toLowerCase;


        //convert to Method reference
        Predicate<Instructor> predicate3 = MethodReferenceExample::greaterThan;
        Instructors.getAll().forEach(instructor -> {
            if (predicate3.test(instructor))
                System.out.println(instructor);
        });

    }

    public static boolean greaterThan(Instructor instructor) {
        return instructor.getYearOfExp() > 5;
    }
}
