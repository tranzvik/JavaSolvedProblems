package MultiThreading;

public class ThreadServices {


    int counter = 0;

    public void executeThredServices() {

        Thread thread1 = new Thread(() -> {
            try {
                printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.setName("Thread1");
        thread2.setName("Thread2");
        thread1.start();
        thread2.start();

    }

    public void printOdd() throws InterruptedException {
        while (counter <= 10) {
            synchronized (this) {
                if (this.counter % 2 == 0) {
                    wait();
                } else {
                    System.out.print(Thread.currentThread().getName());
                    System.out.println(":"+this.counter++);
                    notify();
                }
            }
        }
    }

    public void printEven() throws InterruptedException {
        while (counter <= 10) {
            synchronized (this) {
                if (this.counter % 2 != 0) {
                    wait();
                } else {
                    System.out.print(Thread.currentThread().getName());
                    System.out.println(":"+this.counter++);
                    notify();
                }
            }
        }
    }
}
