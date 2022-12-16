package funtionalprogramming;
/**
 * Consumer interface takes value and return nothing
 * accept() is abstract method
 *
 * IntConsumer,LongConsumer,DoubleConsumer
 *
 */

import bean.Instructor;
import bean.Instructors;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample {
    public static void main(String[] args) {

        //simple consumer
        Consumer<String> consumer = (x) -> System.out.println("consumer Interface val:" + x);
        consumer.accept("test");
        System.out.println("-------------");
        //iterate throw all consumers
        List<Instructor> instructorList = Instructors.getAll();
        Consumer<Instructor> c1 = System.out::println;
        instructorList.forEach(c1);

        System.out.println("-------------");
        //print only name
        Consumer<Instructor> c2 = (x) -> System.out.println(x.getName());
        instructorList.forEach(c2);

        System.out.println("-------------");
        //print name and then courses
        Consumer<Instructor> c3 = (x) -> System.out.println(x.getCourses());
        instructorList.forEach(c2.andThen(c3));

        //filter and print only who have exp more than 5
        System.out.println("-------------");
        instructorList.forEach(x -> {
            if (x.getYearOfExp() > 5)
                c1.accept(x);
        });

        //print the name and courses if exp is greater than 5 and teach online
        System.out.println("-------------");
        instructorList.forEach(x -> {
            if (x.getYearOfExp() > 5 && x.isOnlineCourses())
                c1.andThen(c2).accept(x);
        });

        System.out.println("-------------");
        //int consumer takes int as input
        IntConsumer intConsumer = x -> System.out.println(x * 10);
        intConsumer.accept(1);

        System.out.println("-------------");
        //long consumer takes double as input
        LongConsumer longConsumer = x -> System.out.println(x * 10L);
        longConsumer.accept(2);

        System.out.println("-------------");
        //long consumer takes double as input
        DoubleConsumer doubleConsumer = x -> System.out.println(x * 10);
        doubleConsumer.accept(2.5);

    }

}
