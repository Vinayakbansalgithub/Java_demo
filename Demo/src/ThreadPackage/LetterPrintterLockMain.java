package ThreadPackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LetterPrintterLockMain {

	Lock lock = new ReentrantLock();
	Condition alphabateCondition = lock.newCondition();
	Condition letterCondition = lock.newCondition();

	public static void main(String args[]) throws InterruptedException {

		class Letter implements Runnable {

			LetterPrintterLockMain obj;

			public Letter(LetterPrintterLockMain obj) {
				super();
				this.obj = obj;
			}

			@Override
			public void run() {
				try {
					obj.lock.lock();
					for (int i = 1; i <= 26; i++) {

						System.out.println(Thread.currentThread().getName() + "     " + i);
						obj.alphabateCondition.signalAll();
						obj.letterCondition.await();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					obj.lock.unlock();
				}

			}
		}

		class Alphabate implements Runnable {

			LetterPrintterLockMain obj;

			public Alphabate(LetterPrintterLockMain obj) {
				super();
				this.obj = obj;
			}

			@Override
			public void run() {
				try {
					obj.lock.lock();
					for (int i = 65; i <= 90; i++) {

						System.out.println(Thread.currentThread().getName() + "  " + (char) i);
						obj.letterCondition.signalAll();
						obj.alphabateCondition.await();

					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					obj.lock.unlock();
				}

			}
		}

		// Book object on which wait and notify method will be called
		LetterPrintterLockMain laObj = new LetterPrintterLockMain();
		Letter letter = new Letter(laObj);
		Alphabate alphabate = new Alphabate(laObj);

		// BookReader threads which will wait for completion of book
		Thread letterThread = new Thread(letter, "letter");
		Thread alphabateThread = new Thread(alphabate, "alphabate");

		letterThread.start();
		alphabateThread.start();

	}

}
