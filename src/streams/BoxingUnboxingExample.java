package streams;

/**
 * mapToObj()
 * <p>
 * mapToLong()
 * <p>
 * mapToDouble()
 */

import bean.Instructor;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BoxingUnboxingExample {

    public static void main(String[] args) {
        List<Integer> sampleList;

        //return primitive int stream
        IntStream numStream = IntStream.rangeClosed(0, 10);
        sampleList = numStream.boxed().collect(Collectors.toList());

        sampleList.forEach(System.out::println);

        System.out.println("---------------");
        //unboxing
        Optional<Integer> sum = sampleList.stream().reduce(Integer::sum);
        sum.ifPresent(System.out::println);

        System.out.println("---------------");
        int sum1 = sampleList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        //maptoObject
        System.out.println("---------------");
        List<RandomId> randomIds = IntStream.rangeClosed(0, 5).mapToObj((x) -> {
            return new RandomId(x, new Random().nextInt());
        }).collect(Collectors.toList());

        randomIds.forEach(System.out::println);

        //maptoLong
        System.out.println("---------------");
        LongStream longStream = IntStream.rangeClosed(0, 5).mapToLong(x -> (long) x);
        longStream.forEach(System.out::println);

        //maptoDouble
        System.out.println("---------------");
        DoubleStream doubleStream = IntStream.rangeClosed(0, 5).mapToDouble(x -> (double) x);
        doubleStream.forEach(System.out::println);
    }
}

class RandomId {
    int id;
    int randomNo;

    public RandomId() {
    }

    public RandomId(int id, int randomNo) {
        this.id = id;
        this.randomNo = randomNo;
    }

    @Override
    public String toString() {
        return "RandomId{" +
                "id=" + id +
                ", randomNo=" + randomNo +
                '}';
    }
}


