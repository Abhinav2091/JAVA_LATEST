package JAVA8.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll() {


        List<Instructor> instructorsList = new ArrayList<>(5);

        instructorsList.add(new Instructor("Mike", 10, "Software Developer", "M", true, Arrays.asList("Java programming", "C++ programming", "Python programming")));
        instructorsList.add(new Instructor("Jenny", 5, "Engineer", "F", false, Arrays.asList("Multi-Threading programming", "CI/CD", "Unit Testing")));
        instructorsList.add(new Instructor("Gene", 6, "Manager", "M", false, Arrays.asList("C++ programming", "C programming", "React Native")));
        instructorsList.add(new Instructor("Ram", 15, "Senior Developer", "M", true, Arrays.asList("Java programming", "Angular programming", "React Native")));
        instructorsList.add(new Instructor("Abhinav", 5, "Jav Engineer", "M", true, Arrays.asList("Multi-Threading programming", "Java programming", "Web Service")));

        return instructorsList;

    }
}
