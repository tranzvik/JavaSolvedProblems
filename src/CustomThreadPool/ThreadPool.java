package CustomThreadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {

    BlockingQueue<Runnable> blockingQueue;

    ThreadPool(int threadPoolSize, int noOfThreads) {
        blockingQueue = new LinkedBlockingQueue<>(threadPoolSize);
        TaskExecutor taskExecutor = null;
        for (int i = 0; i < noOfThreads; i++) {
            taskExecutor = new TaskExecutor(blockingQueue);
            Thread thread = new Thread(taskExecutor);
            thread.start();
        }

    }

    public void submit(Runnable runnable) {
        blockingQueue.add(runnable);

        //use put instead of add to solve exception
        //as the put operation waits for sometime
    }

    public static void main(String[] args) {
ThreadPool threadPool = new ThreadPool(3,2);
        for(int taskNumber = 1 ; taskNumber <= 4; taskNumber++) {
            TestTask testTask1 = new TestTask("abcd_"+taskNumber);
            threadPool.submit(testTask1);
        }
    }

}
