package funtionalprogramming;

import bean.Instructor;
import bean.Instructors;

import java.util.List;
import java.util.function.Supplier;

/**
 * reverse of Consumer
 * <p>
 * it return value but take no input
 * <p>
 * has only one abstract method get()
 */
public class SupplierExample {

    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();
        Supplier<List<Instructor>> supplier1 = () -> instructorList;
        System.out.println(supplier1.get());
    }
}
