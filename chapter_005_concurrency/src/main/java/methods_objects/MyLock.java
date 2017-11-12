package methods_objects;

import java.util.ArrayDeque;
import java.util.Queue;


public class MyLock {
    Queue<Thread> queue = new ArrayDeque<>();

    public MyLock() {
    }

    public void lock() throws InterruptedException {
        if (!queue.isEmpty()) {
            synchronized (queue) {
                queue.offer(Thread.currentThread());
                queue.wait();
            }
        } else {
            queue.offer(Thread.currentThread());
        }
    }

    public void unlock() {
        if (!queue.isEmpty()) {
            queue.poll();
            synchronized (queue) {
                queue.notify();
            }
        }
    }
}
