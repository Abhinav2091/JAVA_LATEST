package JAVA8.ParallelStream;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelStreamExample {
    static int tokenCount = 5000;

    public static void main(String[] args) {
        int noOfTime = 200;
        System.out.println(sumSequencialStream());
        System.out.println("-------------------");
        System.out.println(sumParallelStream());
        System.out.println("-------------------");
        System.out.println("time taken by sequencial stream:" + performanceMeasure(ParallelStreamExample::sumSequencialStream, noOfTime) + " in milli sec");
        System.out.println("-------------------");
        System.out.println("time taken by parallel stream:" + performanceMeasure(ParallelStreamExample::sumParallelStream, noOfTime) + " in milli sec");
        System.out.println("-------------------");
        System.out.println("time taken by sequencial stream to sort :" + performanceMeasure(ParallelStreamExample::sortSequencialStream, noOfTime) + " in milli sec");
        System.out.println("-------------------");
        System.out.println("time taken by parallel stream to sort :" + performanceMeasure(ParallelStreamExample::sortParallelStream, noOfTime) + " in milli sec");


    }

    static long performanceMeasure(Supplier supplier, int noOfTime) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfTime; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return System.currentTimeMillis() - startTime;
    }

    static int sumSequencialStream() {
        return IntStream.rangeClosed(0, 5000).sum();
    }

    static int sumParallelStream() {
        return IntStream.rangeClosed(0, 5000).parallel().sum();
    }

    static List<RandomToken> sortSequencialStream() {
        List<RandomToken> randomTokenList = LongStream.rangeClosed(0, tokenCount).mapToObj(i -> {
            return new RandomToken(i, ThreadLocalRandom.current().nextLong(tokenCount));
        }).collect(Collectors.toList());
        randomTokenList.stream().sorted(Comparator.comparing(RandomToken::getToken));
        return randomTokenList;
    }

    static List<RandomToken> sortParallelStream() {
        List<RandomToken> randomTokenList = LongStream.rangeClosed(0, tokenCount).parallel().mapToObj(i -> {
            return new RandomToken(i, ThreadLocalRandom.current().nextLong(tokenCount));
        }).collect(Collectors.toList());
        randomTokenList.stream().parallel().sorted(Comparator.comparing(RandomToken::getToken));
        return randomTokenList;
    }
}

class RandomToken {
    private long id;
    private long token;

    public RandomToken() {
    }

    public RandomToken(long id, long token) {
        this.id = id;
        this.token = token;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }
}
