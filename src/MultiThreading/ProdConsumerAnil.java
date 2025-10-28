package MultiThreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProdConsumerAnil {
    Queue<Integer> bufferQueue = new LinkedList<>();
    final int MAX_QUEUE_SIZE = 10;

    public static void main(String[] args) {
        ProdConsumerAnil prodConsumerAnil = new ProdConsumerAnil();
        Thread producerThread = new Thread(() -> {
            try {
                prodConsumerAnil.produceItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                prodConsumerAnil.consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producerThread.start();
        consumerThread.start();
    }

    public void produceItem() throws InterruptedException {
        synchronized (this) {
            if(bufferQueue.size()==MAX_QUEUE_SIZE) {
                wait();
            } else {
                bufferQueue.add(1);
                notify();
            }
        }
    }

    public void consumeItem() throws InterruptedException {
        synchronized (this) {
            if(bufferQueue.size()==0) {
                wait();
            } else {
                bufferQueue.remove();
                notify();
            }
        }
    }
}
