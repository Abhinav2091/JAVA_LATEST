package funtionalprogramming;
/**
 * Reference to a Constructor
 * * Class::new
 * *
 * * we can only use Constructor reference in the context of functional interface
 * * we cannot an instance of class using above syntax
 * * we can use above syntax by the interface must be functional interface
 */


import bean.Instructor;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mike", 10, "Software Developer", "M", true, Arrays.asList("Java programming", "C++ programming", "Python programming"));
        System.out.println(instructor);
    }
}
