package JAVA8.funtionalprogramming;

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * takes input and output as lambda expression and return value
 * <p>
 * apply() is abstract method
 */
public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Double> sqrt = Math::sqrt;
        System.out.println("sq root of 64:" + sqrt.apply(64));

        System.out.println("---------------");

        //return String in lower case
        Function<String, String> function1 = String::toLowerCase;
        System.out.println(function1.apply("ABHINAV"));
        //concat the string
        Function<String, String> function2 = s -> s.concat(" is my NAME.");
        System.out.println(function1.andThen(function2).apply("Abhinav"));

        System.out.println("---------------");
        //use compose to perform action after the whole apply() method
        System.out.println(function1.compose(function2).apply("Abhinav"));

        System.out.println("---------------");
        List<Instructor> instructorList = Instructors.getAll();

        //return a map consist of <name,list of courses>
        Function<List<Instructor>, Map<String, List<String>>> function3 = instructors -> {
            Map<String, List<String>> resultMap = new HashMap<>();
            instructorList.forEach(instructor -> {
                resultMap.put(instructor.getName(), instructor.getCourses());
            });
            return resultMap;
        };

        System.out.println(function3.apply(instructorList));

    }
}
