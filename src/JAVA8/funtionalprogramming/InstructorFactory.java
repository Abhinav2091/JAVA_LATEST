package JAVA8.funtionalprogramming;

import JAVA8.bean.Instructor;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {

    Instructor getInstructor(String name, int yearOfExp, String title, String gender, boolean onlineCourses, List<String> courses);

}
