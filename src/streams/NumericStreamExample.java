package streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * intStream
 * <p>
 * longStream
 * <p>
 * doubleStream
 */
public class NumericStreamExample {

    public static void main(String[] args) {

        //intStream
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        //will exclude the range last no
        intStream = IntStream.range(1, 10);
        //will include the last no as well
        intStream = IntStream.rangeClosed(1, 10);
        intStream.forEach(System.out::println);


        //longStream
        System.out.println("----------------");
        LongStream longStream = LongStream.of(1L, 2L, 3L, 4L);
        longStream = LongStream.range(1, 10);
        longStream = LongStream.rangeClosed(1, 10);
        longStream.forEach(System.out::println);

        //doubleStream
        System.out.println("----------------");
        DoubleStream doubleStream = null;
        doubleStream = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5);
        doubleStream = LongStream.range(1, 10).asDoubleStream();
        doubleStream = LongStream.rangeClosed(1, 10).asDoubleStream();
        doubleStream.forEach(System.out::println);


    }
}
