package CustomThreadPool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskExecutor implements Runnable{

    private BlockingQueue<Runnable> blockingQueue;

    TaskExecutor(BlockingQueue<Runnable> blockingQueue) {
        this.blockingQueue = blockingQueue;

    }

    @Override
    public void run() {
        while(true){
            try {
                Runnable runnable = blockingQueue.take();
                runnable.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
