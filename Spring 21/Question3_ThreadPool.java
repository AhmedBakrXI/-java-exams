package chapter30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question3_ThreadPool {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);
        // you can use any number of threads or use
        // "newCachedThreadPool" but you have to
        // wait until the task is done "while loop"
        IntWrapper intWrapper = new IntWrapper();
        for (int i = 0; i < 1000; i++) {// loop to create and launch 1000 thread
            executor.execute(intWrapper);
        }
        executor.shutdown();

        while (!executor.isTerminated()) {// loop waits until all tasks are completed
        }
        ;

        System.out.println(intWrapper.sum);

    }
}

class IntWrapper implements Runnable {
    int sum;
    /*
     * you can write also int sum = 0 as both expressions result in the same result
     * because primitive data fields are initialized to 0
     */

    @Override
    public void run() {
        Increment();
    }

    private synchronized void Increment() {
        this.sum++;
    }
}
