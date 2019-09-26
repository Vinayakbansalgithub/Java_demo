package ThreadPackage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//https://www.youtube.com/watch?v=7VqWkc9o7RM&list=PLhfHPmPYPPRk6yMrcbfafFGSbE2EPK_A6&index=14
public class ReadWriteLockTest {
	ReadWriteLock rwLock = new ReentrantReadWriteLock();
	Lock readLock = rwLock.readLock();
	Lock writeLock = rwLock.writeLock();

	void read() {
		readLock.lock();
		System.out.println("Inside read");
		try {
			// reading data
			Thread.sleep(300);
			System.out.println("Reading data");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			readLock.unlock();
		}
	};

	void write() {
		writeLock.lock();

		try {
			Thread.sleep(300);
			System.out.println("inside write data");
			// update data
			System.out.println("writing data");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			writeLock.unlock();
		}
	};

	public static void main(String[] args) {

		ReadWriteLockTest obj = new ReadWriteLockTest();
		Thread t1 = new Thread(() -> obj.read());
		Thread t2 = new Thread(() -> obj.read());
		Thread t3 = new Thread(() -> obj.write());
		Thread t4 = new Thread(() -> obj.write());
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
