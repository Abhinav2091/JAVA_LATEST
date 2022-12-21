package JAVA8.streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * sum()
 * <p>
 * max()
 * <p>
 * min()
 * <p>
 * average()
 */
public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        Integer sum = IntStream.rangeClosed(0, 1000).sum();
        System.out.println(sum);

        System.out.println("----------------");
        OptionalInt minNo = IntStream.rangeClosed(0, 1000).min();
        minNo.ifPresent(System.out::println);

        System.out.println("----------------");
        OptionalInt maxNo = IntStream.rangeClosed(0, 1000).max();
        maxNo.ifPresent(System.out::println);

        System.out.println("----------------");
        OptionalDouble average = IntStream.rangeClosed(0, 1000).asDoubleStream().average();
        average.ifPresent(System.out::println);
    }
}
