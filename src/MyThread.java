public class MyThread extends Thread {
    private Runnable task;
    private boolean needToStop;

    public MyThread(Runnable task) {
        this.task = task;

    }

    public MyThread() {
    }

    public void stopThisThread() {
        System.out.println("Thread " + threadId() + "got canceled");
        needToStop = true;

        interrupt();
    }

    @Override
    public void run() {
        System.out.println("Thread" + this.threadId() + " has started");
        try {
            if (task != null)
                task.run();
            sleep(10000);

            System.out.println("Thread" + this.threadId() + " has finished Running");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }
}
