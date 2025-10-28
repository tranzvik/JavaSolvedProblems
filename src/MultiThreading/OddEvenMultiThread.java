package MultiThreading;

public class OddEvenMultiThread {

     int counter;

    public static void main(String[] args) {

        OddEvenMultiThread oddEvenMultiThread = new OddEvenMultiThread();
        Thread threadEven = new Thread(() -> {
            oddEvenMultiThread.printEven();
        });
        Thread threadOdd = new Thread(() -> {
            oddEvenMultiThread.printOdd();
        });

        threadOdd.start();
        threadEven.start();
    }

    public synchronized void printOdd()  {
        while (counter <= 10) {
            if (counter % 2 != 0) {
                System.out.println(counter++);
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printEven() {
        while (counter <= 10) {
            if (counter % 2 == 0) {
                System.out.println(counter++);
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //System.out.println(counter++);

        }
    }
}
