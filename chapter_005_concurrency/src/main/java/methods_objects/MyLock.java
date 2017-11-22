package methods_objects;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class MyLock {
    @GuardedBy("mutex")
    volatile boolean lock = false;
    Object object = new Object();


    public MyLock() {
    }

    public void lock() throws InterruptedException {
        synchronized (object) {
            while (lock) {
               // System.out.println(Thread.currentThread().getName());
                object.wait();
            }
            lock = true;
        }
    }

    public void unlock() {
        lock = false;
        synchronized (object) {
            object.notifyAll();
        }
    }
}
