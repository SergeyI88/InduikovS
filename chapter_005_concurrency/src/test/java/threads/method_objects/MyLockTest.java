package threads.method_objects;

import methods_objects.MyLock;
import org.junit.Test;

import java.util.concurrent.locks.Lock;

import static java.lang.Thread.sleep;

public class MyLockTest {
    static MyLock lock = new MyLock();

    @Test
    public void test() {
        MyThread myThread = new MyThread(lock);
        MyThread2 myThread2 = new MyThread2(lock);
        MyThread3 myThread3 = new MyThread3(lock);
        myThread3.start();
        myThread.start();
        myThread2.start();
        try {
            myThread.join();
            myThread2.join();
            myThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class MyThread extends Thread {
        MyLock lock;

        public MyThread(MyLock lock) {
            this.lock = lock;
            this.setName("i will wait");
        }

        @Override
        public void run() {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            doSmth();
        }
    }

    class MyThread2 extends Thread {
        MyLock lock;

        public MyThread2(MyLock lock) {
            this.lock = lock;
            this.setName("i will do smth");
        }

        @Override
        public void run() {
            doSmth();
        }
    }

    class MyThread3 extends Thread {
        MyLock lock;

        public MyThread3(MyLock lock) {
            this.lock = lock;
            this.setName("i wait more than other");
        }

        @Override
        public void run() {
            try {
                sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            doSmth();
        }
    }

    public void doSmth() {

        try {
            lock.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s", Thread.currentThread().getName());
            System.out.println();

         lock.unlock();
    }
}
