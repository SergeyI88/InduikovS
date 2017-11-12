package methods_objects;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * @author Sergey
 * @since 10.11.2017
 * <p>
 * This is app show us how can speed up our app.
 * Time is executing this app 9-10s.
 * App is in single thread executing 25-28s.
 */

public class ThreadPool implements Executor {
    Queue<Runnable> ourTasks = new ArrayDeque<>();
    /**
     * This is isRunning informs main thread need stopping
     */
    boolean isRunning = true;

    /**
     * Constructor
     *
     * @param nThreads quantity started threads
     */
    public ThreadPool(int nThreads) {
        for (int i = 0; i < nThreads; i++) {
            new Thread(new InnerThread()).start();
        }
    }

    @Override
    public void execute(Runnable command) {
        if (ourTasks.add(command)) {
            synchronized (ourTasks) {
                ourTasks.notifyAll();
            }
        }
        ;
    }

    /**
     * He is stopping all threads if queue is empty and tasks will not be more.
     *
     * @throws InterruptedException
     */
    public void shutdown() throws InterruptedException {
        while (!ourTasks.isEmpty()) {
            Thread.currentThread().sleep(1000);
        }
        isRunning = false;
    }

    /**
     * Class inner thread
     */
    private class InnerThread implements Runnable {

        @Override
        public void run() {
            while (isRunning) {
                if (ourTasks.isEmpty()) {
                    synchronized (ourTasks) {
                        try {
                            ourTasks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    System.out.println(Thread.currentThread().getName());
                    Runnable r = ourTasks.poll();
                    if (r != null) {
                        r.run();
                    }
                }
            }
        }
    }
}

