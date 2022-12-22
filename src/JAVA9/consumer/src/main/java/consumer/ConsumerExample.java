package consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * reading messages from Producer Queue
 */
public class ConsumerExample {

    ArrayBlockingQueue<Integer> arrayBlockingQueue;

    public ConsumerExample() {
    }

    public ConsumerExample(ArrayBlockingQueue<Integer> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
        Runnable consumer = () -> {
            while (true) {
                try {
                    TimeUnit.MILLISECONDS.sleep(5000);
                    Integer pool;
                    pool = arrayBlockingQueue.take();
                    System.out.println("Pooled:" + pool);
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(consumer);
        executorService.shutdown();
    }
}