package producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * adding messages in queue using Executor Service
 */
public class ProducerExample {
    ArrayBlockingQueue<Integer> arrayBlockingQueue;

    public ProducerExample() {
    }

    public ProducerExample(ArrayBlockingQueue<Integer> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
        Runnable producer = () -> {
            int i = 0;
            while (true)
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Added:" + i);
                    TimeUnit.MILLISECONDS.sleep(1000);

                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(producer);
        executorService.shutdown();
    }
}