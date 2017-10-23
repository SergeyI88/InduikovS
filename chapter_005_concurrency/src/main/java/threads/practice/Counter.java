package threads.practice;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * Created by Sergey on 12.10.2017.
 *
 * Class Counter counts numbers from two threads at once.
 */
@ThreadSafe
public class Counter implements Runnable {
    /**
     * @count - is start value.
     */
    @GuardedBy("this")
    long count = 0;

    /**
     * method run - he calls method increment() and show us new value on console.
     */
    @Override
    public void run() {
        increment(this);
        System.out.println(count);
    }

    /**
     * method increment - accept exemplar class Counter and makes increment
     * @param counter - counter
     */
    private void increment(Counter counter) {
        synchronized (this) {
            for (; counter.count < 10; ) {
                counter.count++;
                System.out.println(counter.count);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread threadA = new Thread(counter);
        Thread threadB = new Thread(counter);
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
    }
}
