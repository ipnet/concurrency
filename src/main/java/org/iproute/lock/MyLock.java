package org.iproute.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author winterfell
 */
public class MyLock {

    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

    }

    static void sayHello() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
