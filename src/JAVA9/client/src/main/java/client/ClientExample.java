package client;

import consumer.ConsumerExample;
import producer.ProducerExample;


import java.util.concurrent.ArrayBlockingQueue;

/**
 * producing producer and
 * consuming consumer modules
 */
public class ClientExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(5);
        ProducerExample producer = new ProducerExample(arrayBlockingQueue);
        ConsumerExample consumer = new ConsumerExample(arrayBlockingQueue);
    }
}