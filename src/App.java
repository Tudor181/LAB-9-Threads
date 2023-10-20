import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many threads do u want to run:");
        int numberOfThreads = scanner.nextInt();
        List<MyThread> threads = new ArrayList<MyThread>();

        for (int i = 0; i < numberOfThreads; ++i) {
            threads.add(new MyThread());
        }
        for (MyThread myThread : threads) {
            myThread.start();
        }

        System.out.println("Input the id u want to cancel:");
        int idOfCanceledThread = scanner.nextInt();
        for (MyThread myThread : threads) {
            if (idOfCanceledThread == myThread.threadId()) {
                if (myThread.isAlive()) {
                    System.out.println("zice ca e in viata");
                    myThread.stopThisThread();
                } else {
                    System.out.println("Thread u requested already finished running");
                }

            }
        }

        ParcurgereString parcurgereString = new ParcurgereString("Parcugeti acest string");
        Runnable task = () -> parcurgereString.parcurge();
        Runnable task2 = () -> parcurgereString.parcurgeInvers();
        MyThread thread1 = new MyThread(task);
        MyThread thread2 = new MyThread(task2);
        thread1.start();
        thread2.start();
    }
}
