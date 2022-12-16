package funtionalprogramming;

import bean.Instructor;
import bean.Instructors;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * BiConsumer -->takes two argument as input
 */
public class BiConsumersExample {
    public static void main(String[] args) {
        //print two number
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println(x + " and " + y);
        biConsumer1.accept(2, 3);

        System.out.println("--------------");

        List<Instructor> instructorList = Instructors.getAll();
        //print out name and gender of Instructor
        BiConsumer<String, String> biConsumer2 = (name, gender) -> System.out.println("name-->" + name + "  gender->>" + gender);
        instructorList.forEach(instructor -> biConsumer2.accept(instructor.getName(), instructor.getGender()));

        System.out.println("--------------");
        //print name and list of courses
        BiConsumer<String, List<String>> biConsumer3 = (name, courses) -> System.out.println("name is:" + name + " and courses are:" + courses);
        instructorList.forEach(instructor -> biConsumer3.accept(instructor.getName(), instructor.getCourses()));

        System.out.println("--------------");
        //print name and list of courses who teach online
        instructorList.forEach(instructor -> {
            if (instructor.isOnlineCourses())
                biConsumer3.accept(instructor.getName(), instructor.getCourses());
        });


    }
}
