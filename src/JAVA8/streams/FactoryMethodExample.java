package JAVA8.streams;

import java.util.Random;
import java.util.stream.Stream;

/**
 * of()
 * <p>
 * iterate()
 * <p>
 * generate()
 */
public class FactoryMethodExample {
    public static void main(String[] args) {

        //of
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::println);

        System.out.println("--------------");
        //iterate()
        //generate 5 even no
        Stream<Integer> stream1 = Stream.iterate(0, x -> x + 2).limit(5);
        stream1.forEach(System.out::println);

        System.out.println("--------------");
        //generate()
        //generate 5 random no
        Stream<Integer> stream2 = Stream.generate(new Random()::nextInt).limit(5);
        stream2.forEach(System.out::println);

    }

}
