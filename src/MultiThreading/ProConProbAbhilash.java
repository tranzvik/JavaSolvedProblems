package MultiThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProConProbAbhilash {

    private static final Lock lock = new ReentrantLock();
    private static final Condition producer = lock.newCondition();
    private static final Condition consumer = lock.newCondition();
    private static final int MAX_SIZE = 10;
    private static int count = 0;

    public static void main(String[] args) {
        Producer producer = new ProConProbAbhilash.Producer();
        Consumer consumer = new ProConProbAbhilash.Consumer();

        Thread t1 = new Thread(() -> {
            while (true) {
                producer.produce();
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                consumer.consume();
            }
        });

        t1.start();
        t2.start();
    }

    static class Producer {
        public void produce() {
            try {
                lock.lock();
                while (count == MAX_SIZE) {
                    try {
                        producer.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Producer is adding data .. " + ++count);
                consumer.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    static class Consumer {
        public void consume() {
            try {
                lock.lock();
                while (count == 0) {
                    try {
                        consumer.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Consumer is consuming data .. " + --count);
                producer.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }
}
