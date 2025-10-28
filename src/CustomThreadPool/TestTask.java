package CustomThreadPool;

public class TestTask implements Runnable {

    String taskNumber;

    TestTask(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        System.out.println("Current task:" + this.taskNumber);

    }
}
