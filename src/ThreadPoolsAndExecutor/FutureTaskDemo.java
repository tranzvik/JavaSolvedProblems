package ThreadPoolsAndExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureTaskDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        FutureTask<String> futureTask1 = new FutureTask<>(thread1,"task 1 complete");
        FutureTask<String> futureTask2 = new FutureTask<>(thread2,"task 2 complete");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(futureTask1);
        executorService.submit(futureTask2);

        while (true) {
            try {

                // if both future task complete
                if (futureTask1.isDone() && futureTask2.isDone()) {

                    System.out.println("Both FutureTask Complete");

                    // shut down executor service
                    executorService.shutdown();
                    return;
                }

                if (!futureTask1.isDone()) {

                    // wait indefinitely for future
                    // task to complete
                    System.out.println("FutureTask1 output = "
                            + futureTask1.get());
                }

                System.out.println("Waiting for FutureTask2 to complete");

                // Wait if necessary for the computation to complete,
                // and then retrieves its result
                String s = futureTask2.get(250, TimeUnit.MILLISECONDS);

                if (s != null) {
                    System.out.println("FutureTask2 output=" + s);
                }
            }

            catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }

    }
}


