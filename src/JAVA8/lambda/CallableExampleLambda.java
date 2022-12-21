package JAVA8.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CallableExampleLambda {
    public static int[] intArray = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < intArray.length / 2; i++)
                sum = sum + intArray[i];

            return sum;
        };

        Callable callable2 = () -> {
            int sum = 0;
            for (int i = intArray.length / 2; i < intArray.length; i++)
                sum = sum + intArray[i];

            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);
        List<Future<Integer>> results = executorService.invokeAll(taskList);
        int sum = 0;
        for (Future<Integer> result : results) {
            sum = sum + result.get();
            System.out.println(sum);
        }
        System.out.println("total by callable:" + sum);
        System.out.println("correct total:" + total);
        executorService.shutdown();

    }
}
